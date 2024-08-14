package vector.india.Movie_Recommendation_System_Application.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import vector.india.Movie_Recommendation_System_Application.model.GenresModel;

@Repository("genresRepo")       	
public class GenresRepositoryImpl implements GenresRepository {

	@Autowired
	JdbcTemplate template;
	
	List<GenresModel> list;
	
	@Override
	public boolean isAddGenres(final GenresModel model) {
		int value=template.update("insert into genres values('0',?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,model.getGentitle());
				
			}
			
		});
		
		return value>0?true:false;
	}
	
	@Override
	public List<GenresModel> getAllGenres() {
		list=template.query("select *from genres order by gen_id asc",new RowMapper<GenresModel>() {

			@Override
			public GenresModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				GenresModel gm=new GenresModel();
				gm.setGenid(rs.getInt(1));
				gm.setGentitle(rs.getString(2));
				return gm;
			}
			
		});
		return list;
	}

}
