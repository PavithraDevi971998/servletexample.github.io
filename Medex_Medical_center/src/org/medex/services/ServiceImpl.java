package org.medex.services;

import org.medex.bean.Doctor1;
import org.medex.dao.Doctor_Dao;
import org.medex.dao.Doctor_DaoImpl;

public class ServiceImpl implements DoctorService1 {
Doctor_Dao dao=new Doctor_DaoImpl();
	
	public boolean register(Doctor1 d) {
		boolean res=dao.insert(d);
		return res;
}
}