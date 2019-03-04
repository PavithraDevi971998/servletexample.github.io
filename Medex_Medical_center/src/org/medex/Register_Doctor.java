package org.medex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.medex.bean.Doctor1;
import org.medex.services.DoctorService1;
import org.medex.services.ServiceImpl;


@WebServlet("/reg")
public class Register_Doctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	DoctorService1 service=new ServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	
		String pwd=request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		String qualification=request.getParameter("qualification");
		String specialization=request.getParameter("specialization");
		String contact_no=request.getParameter("contact_no");
		String email=request.getParameter("email");
		String address=request.getParameter("addres");
		String zipcode=request.getParameter("zipcode");
		String city=request.getParameter("city");
		//System.out.println(eno+"\t"+name+"\t"+address+"\t"+gender);
		boolean res=service.register(new Doctor1(pwd,fname,lname,gender,age,qualification,specialization,contact_no,email,address,zipcode,city));
		if(res==true)
			pw.println("<h2>Successfully inserted</h2>");
		else
			pw.println("<h2>Not inserted</h2>");
		pw.close();
	}

}
