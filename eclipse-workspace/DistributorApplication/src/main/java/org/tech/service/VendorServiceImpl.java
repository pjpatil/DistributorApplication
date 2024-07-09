package org.tech.service;

import java.util.List;

import org.tech.model.VendorModel;
import org.tech.repository.*;

public class VendorServiceImpl implements VendorService {

	VendorRepository vendRepo =new VendorRepositoryImpl();
	
	@Override
	public boolean isAddNewVendor(VendorModel model) {
		
		return vendRepo.isAddNewVendor(model);
	}

	@Override
	public List<VendorModel> getvendorList() {
		
		return vendRepo.getvendorList();
	}

	@Override
	public boolean isDeleteVendorById(int vendorid) {
		
		return vendRepo.isDeleteVendorById(vendorid);
	}

}
