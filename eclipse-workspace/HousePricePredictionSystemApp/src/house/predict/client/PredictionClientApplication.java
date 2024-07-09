package house.predict.client;
import java.util.*;

import house.predict.model.CityMasterModel;
import house.predict.service.CityMasterService;
public class PredictionClientApplication {

	public static void main(String[] args) {

		CityMasterService cms= new CityMasterService();
		
		do {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("+-----------------------------------------------------------+");
			System.out.println("|\t** House_Price_Prediction_System_Menu **\t    |");
			System.out.println("|-----------------------------------------------------------|");
			System.out.println("|\t\t 1 : Add New City.                          |");
			System.out.println("|\t\t 2 : Display all Citys.                     |");
			System.out.println("|\t\t 3 : Add new Bluk cities.                   |");
			System.out.println("|\t\t 4 : Add new Areas.                         |");
			System.out.println("|\t\t 5 : Display Areas.                         |");
			System.out.println("|-----------------------------------------------------------|");
			System.out.println("|\tAdmin:)mr_pawar96k\t\t\t<java_jdbc> |");
			System.out.println("+-----------------------------------------------------------+");
			System.out.println("Enter your choice:");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter city name");
				String cityName=sc.next();
				CityMasterModel model=new CityMasterModel();
				model.setCityName(cityName);
				
				boolean b=cms.isAddCity(model);
				if(b) {
					System.out.println("New city Added In Database");
				}
				else {
					System.out.println("City not added");
				}
				
				break;
				
			case 2:
				List<CityMasterModel> list =cms.getAllCities();
				if(list!=null){
					System.out.println("----------------------------------------------");
					System.out.println("City_Id \tCity_Name");
					System.out.println("----------------------------------------------");
					
					list.forEach((m)->System.out.println(m.getCityId()+"\t\t"+m.getCityName()));
					
					System.out.println("----------------------------------------------");
					
				}
				else {
					System.out.println("There is no city present.");
				}
				break;
			
			case 3:
				Boolean b3=cms.isBulkAddCities();
				if(b3) {
					System.out.println("City added Successfully..");
				}
				else {
					System.out.println("Some problem is there...!");
				}
				break;
				
				
			case 4:
				sc.nextLine();
				System.out.println("Enter ciry name:");
			    cityName=sc.nextLine();
				int cityId=cms.getCityId(cityName);
				System.out.println(cityId);
				
				if(cityId!=-1) {
					System.out.println("Enter area name:");
					String areaName=sc.next();
				}
				else {
					System.out.println("City not Present in database.");
					System.out.println("Do you want to add this city in database?");
					String msg=sc.next();
					if(msg.equals("yes")){
						System.out.println("Enter city name");
						cityName=sc.next();
						model=new CityMasterModel();
						model.setCityName(cityName);
						
						b=cms.isAddCity(model);
						if(b) {
							System.out.println("New city Added In Database");
						}
						else {
							System.out.println("City not added");
						}
					}
					else {
						System.out.println("Thank you...!");
					}
				}
				
				
				break;
			default:
				System.out.println("wrong choice!");
			}

			
			
		}while(true);
		
		
	}

}
