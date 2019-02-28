package org.cts;

public class Emp {

private int eno;
private String name;
private String address;
private String gender;
public Emp()
{
	
}
public Emp(int eno, String name, String address, String gender) {
	super();
	this.eno = eno;
	this.name = name;
	this.address = address;
	this.gender = gender;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
