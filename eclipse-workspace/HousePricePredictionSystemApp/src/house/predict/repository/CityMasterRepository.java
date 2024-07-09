package house.predict.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import house.predict.config.DBConfig;
import house.predict.config.DBHelper;
import house.predict.config.PathHelper;
import house.predict.model.CityMasterModel;

public class CityMasterRepository extends DBHelper {
	private int areaid=0;

	private List<CityMasterModel> list = new ArrayList<CityMasterModel>();

	/*
	 * this method can add city in daytabase table name as citymaster and get data
	 * from CityMasterModel class
	 */
	public boolean isAddNewCity(CityMasterModel model) {
		try {
			stmt = conn.prepareStatement("insert into citymaster values('0',?)");
			stmt.setString(1, model.getCityName());
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}

	}

//	 fatch data in collection 
	public List<CityMasterModel> getAllCities() {
		try {
			stmt = conn.prepareStatement("select *from citymaster");
			rs = stmt.executeQuery();
			while (rs.next()) {
				CityMasterModel model = new CityMasterModel();
				model.setCityId(rs.getInt(1));
				model.setCityName(rs.getString(2));
				list.add(model);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return null;
		}
	}

	public boolean isBulkAddCities() {
		try {
			FileReader fr = new FileReader(PathHelper.path + "cityData.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int value = 0;
			while ((line = br.readLine()) != null) {
				String data[] = line.split(",");
				stmt = conn.prepareStatement("insert into citymaster values('0',?)");
				stmt.setString(1, data[1]);
				value = stmt.executeUpdate();
			}
			return value > 0 ? true : false;

		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}
	
	public int getCityId(String name){
		try {
			stmt=conn.prepareStatement("select cityid from citymaster where cityname=?");
			stmt.setString(1, name);
			rs=stmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);  // if cityid is present then consider city exist in databses
			}
			else {
				return -1;  // -1 indicate city not present in database table
			}
		}
		catch(Exception ex) {
			System.out.println("Error id "+ex);
			return -1;
		}
		
	}
	
	public int getAreaIdAutomatic() {
		try {
			stmt=conn.prepareStatement("select max(aid) from areamaster");
			rs=stmt.executeQuery();
			if(rs.next()) {
				this.areaid=rs.getInt(1);
			}
			++areaid;
		}
		catch(Exception ex) {
			return 0;
			
		}
		return 0;
	}
	
	

}
