package org.medex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.medex.bean.Doctor1;
import org.medex.util.DBConstants;
import org.medex.util.DBUtil;
public class Doctor_DaoImpl implements Doctor_Dao {
	@Override
	public boolean insert(Doctor1 d) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
			pst=con.prepareStatement("insert into doctor_details(password,fname,lname,gender,age,qualification,specialization,contact_no,email,address,zipcode,city) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, d.getPwd());
			pst.setString(2, d.getFname());
			pst.setString(3, d.getLname());
			pst.setString(4, d.getGender());
			pst.setInt(5, d.getAge());
			pst.setString(6, d.getQualification());
			pst.setString(7, d.getSpecialization());
			pst.setString(8, d.getContact_no());
			pst.setString(9, d.getEmail());
			pst.setString(10, d.getAddress());
			pst.setString(11, d.getZipcode());
			pst.setString(12, d.getCity());
			int r=pst.executeUpdate();
			
			if(r>0)
				b=true;
			else
				b=false;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

	


}
