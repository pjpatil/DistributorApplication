package org.tech.repository;

import java.util.List;

import org.tech.model.VendorModel;

public interface VendorRepository {
	public boolean isAddNewVendor(VendorModel model);
	public List<VendorModel> getvendorList();
	public boolean isDeleteVendorById(int vendorid);
	
}
