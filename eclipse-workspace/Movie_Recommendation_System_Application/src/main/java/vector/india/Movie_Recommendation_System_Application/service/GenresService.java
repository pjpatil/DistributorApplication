package vector.india.Movie_Recommendation_System_Application.service;

import java.util.List;

import vector.india.Movie_Recommendation_System_Application.model.GenresModel;

public interface GenresService {

	public boolean isAddGenres(GenresModel model);
	public List<GenresModel> getAllGenres();
}
