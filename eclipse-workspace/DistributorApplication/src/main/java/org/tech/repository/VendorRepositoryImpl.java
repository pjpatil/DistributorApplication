package org.tech.repository;

import java.util.ArrayList;
import java.util.List;

import org.tech.model.VendorModel;
import org.tech.service.VendorService;

public class VendorRepositoryImpl extends DBParent implements VendorService, VendorRepository{

	List<VendorModel> list;
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

	@Override
	public List<VendorModel> getvendorList() {
		try {
			list=new ArrayList<VendorModel>();
			stmt=conn.prepareStatement("select *from vendor order by vid");
			rs=stmt.executeQuery();
			while(rs.next()) {
				VendorModel v=new VendorModel();
				v.setId(rs.getInt(1));
				v.setName(rs.getString(2));
				this.list.add(v);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex){
			System.out.println("Error is "+ex);
			return null;
		}
		
	}

	@Override
	public boolean isDeleteVendorById(int vendorid) {
		try {
			stmt=conn.prepareStatement("delete from vendor where vid=?");
			stmt.setInt(1, vendorid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return false;
		}
		
	}

}
