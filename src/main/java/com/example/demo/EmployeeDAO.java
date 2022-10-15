package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {
	//automatically it is going to generate a refernce to the object
		@Autowired
		EmployeeRepo repo;
		
		public Employee insert(Employee e) {
			return repo.save(e);
		}
		
		public List<Employee> getall(){
			return repo.findAll();
		}
		
		
		public Employee getbyid(int id) {
			return repo.getById(id);
		}
		
		public void delete(int id) {
			 repo.deleteById(id);
		}
		
		
		/*in jpa we dont have a inbuilt update command 
		1.we fetch the record from the table  
		2.we set the value 
		3. we save the value(insert)*/
	                            // 1 suresh s@c.c ->from controller   // 1 karthik s@c.c ->inserted into the table	
		public Employee updateByName(Employee e) {
			//1.we fetch the record from the table
			Employee ee=repo.findById(e.getEmpno()).orElse(null);// 1 karthik s@c.c
			ee.setEmpname(e.getEmpname());//karthik->suresh
			return repo.save(ee);
			
		}
	}


