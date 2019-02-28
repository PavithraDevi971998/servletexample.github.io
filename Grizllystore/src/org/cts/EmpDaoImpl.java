package org.cts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public  class EmpDaoImpl implements EmpDao {

	@Override
	public boolean insert(Emp e) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
			pst=con.prepareStatement("insert into grizllystore(id,name,address) values(?,?,?)");
			pst.setInt(1, e.getid());
			pst.setString(2, e.getName());
			pst.setString(3, e.getAddress());
			int r=pst.executeUpdate();
			con.close();
			if(r>0)
				b=true;
			else
				b=false;
			con.close();
			
		} catch (Exception e2) {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		return b;
	}
}

	