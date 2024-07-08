package org.tech.service;

import org.tech.model.VendorModel;
import org.tech.repository.*;

public class VendorServiceImpl implements VendorService {

	VendorRepository vendRepo =new VendorRepositoryImpl();
	
	@Override
	public boolean isAddNewVendor(VendorModel model) {
		
		return vendRepo.isAddNewVendor(model);
	}

}
