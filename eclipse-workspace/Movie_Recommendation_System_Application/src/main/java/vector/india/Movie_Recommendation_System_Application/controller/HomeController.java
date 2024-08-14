package vector.india.Movie_Recommendation_System_Application.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vector.india.Movie_Recommendation_System_Application.model.AdminModel;
import vector.india.Movie_Recommendation_System_Application.model.GenresModel;
import vector.india.Movie_Recommendation_System_Application.service.GenresService;

@Controller
public class HomeController {

	@Autowired
	GenresService genresService;
	
	@RequestMapping(value = "/")
	public String test(HttpServletResponse response) throws IOException {
		return "login";
	}

	@RequestMapping(value = "/validadmin", method = RequestMethod.POST)
	public String adminLogin(AdminModel admin, Map map) {

		if (admin.getAmobileno().equals("admin") && admin.getApassword().equals("admin")) {
			return "home";
		} else {
			map.put("msg", "invalid username and password");
			return "login";
		}
	}

	

	@RequestMapping(value = "/addgenres", method = RequestMethod.GET)
	public String addNewGenres() {

		return "addGenres";
	}
	
	@RequestMapping(value="/savegen", method = RequestMethod.POST)
	public String saveNewGenres(GenresModel genres, Map map) {
		boolean b = genresService.isAddGenres(genres);
		map.put("msg","save succeessfully...");
		return "addGenres";
		
	}
	@RequestMapping("/showgenres")
	public String showAllGenres(Map map) {
		List list=genresService.getAllGenres();
		
		map.put("getallgen", list);
		return "showgen";
	}

	
}
