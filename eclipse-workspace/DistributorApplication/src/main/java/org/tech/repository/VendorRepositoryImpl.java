package org.tech.repository;

import org.tech.model.VendorModel;
import org.tech.service.VendorService;

public class VendorRepositoryImpl extends DBParent implements VendorService, VendorRepository{

	@Override
	public boolean isAddNewVendor(VendorModel model) {
		try {
			stmt=conn.prepareStatement("insert into vendor values('0',?)");
			stmt.setString(1,model.getName());
			int value=stmt.executeUpdate();
			if(value>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return false;
		}
		
	}

}
