package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
private String empname;
private String phono;
private int age;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getPhono() {
	return phono;
}
public void setPhono(String phono) {
	this.phono = phono;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
