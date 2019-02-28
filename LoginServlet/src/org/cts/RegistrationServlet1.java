package org.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1")
public class RegistrationServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmpService service=new ServiceImpl();
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int eno=Integer.parseInt(request.getParameter("eno"));
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		//System.out.println(eno+"\t"+name+"\t"+address+"\t"+gender);
		boolean res=service.register(new Emp(eno, name, address, gender));
		if(res==true)
			pw.println("<h2>Successfully inserted</h2>");
		else
			pw.println("<h2>Not inserted</h2>");
		pw.close();
	}

}
