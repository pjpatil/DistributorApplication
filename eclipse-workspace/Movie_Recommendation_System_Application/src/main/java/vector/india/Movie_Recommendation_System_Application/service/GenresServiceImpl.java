package vector.india.Movie_Recommendation_System_Application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vector.india.Movie_Recommendation_System_Application.model.GenresModel;
import vector.india.Movie_Recommendation_System_Application.repository.GenresRepository;

@Service("genresService")
public class GenresServiceImpl  implements GenresService {

	@Autowired
	GenresRepository genresRepo;
	
	@Override
	public boolean isAddGenres(GenresModel model) {

		boolean b=genresRepo.isAddGenres(model);
		return b;
	}

	@Override
	public List<GenresModel> getAllGenres() {
		return genresRepo.getAllGenres();
	}

}
