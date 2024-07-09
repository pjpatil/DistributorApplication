package house.predict.service;

import java.util.List;

import house.predict.model.CityMasterModel;
import house.predict.repository.CityMasterRepository;

public class CityMasterService {

	CityMasterRepository cityRepo  = new CityMasterRepository();
	
	public boolean isAddCity(CityMasterModel model) {
		boolean b= cityRepo.isAddNewCity(model);
		return b;
	}
	
	public List<CityMasterModel> getAllCities(){
//		List<CityMasterModel>list= cityRepo.getAllCities();
//		return list;
		
		return cityRepo.getAllCities();
	}
	
	public boolean isBulkAddCities() {
		return cityRepo.isBulkAddCities();
	}
	
	public int getCityId(String cityName){
		return cityRepo.getCityId(cityName);
	}
}
