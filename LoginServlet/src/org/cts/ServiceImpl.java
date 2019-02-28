package org.cts;
public class ServiceImpl implements EmpService{
EmpDao dao=new EmpDaoImpl();
	
	public boolean register(Emp e) {
		boolean res=dao.insert(e);
		return res;
}
}