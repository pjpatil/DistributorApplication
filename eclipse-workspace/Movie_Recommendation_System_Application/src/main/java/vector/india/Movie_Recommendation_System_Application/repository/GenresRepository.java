package vector.india.Movie_Recommendation_System_Application.repository;

import java.util.List;

import vector.india.Movie_Recommendation_System_Application.model.GenresModel;

public interface GenresRepository {

	public boolean isAddGenres(GenresModel model);
	public List<GenresModel> getAllGenres();
}
