package org.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws NumberFormatException, IOException {
        EmpDaoImpl dao=new EmpDaoImpl();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the student details");
        int id=Integer.parseInt(br.readLine());
        String Name=br.readLine();
        String Address=br.readLine();
        Emp s=new Emp(id,Name,Address);
        boolean b=dao.insert(s);
        if(b)
            System.out.println("inserted");
        else
            System.out.println("not inserted");
    }

}



