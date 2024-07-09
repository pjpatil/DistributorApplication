package org.tech.service;

import java.util.List;
import org.tech.model.VendorModel;

public interface VendorService {

	public boolean isAddNewVendor(VendorModel model);
	public List<VendorModel> getvendorList();
	public boolean isDeleteVendorById(int vendorid);
	
}
