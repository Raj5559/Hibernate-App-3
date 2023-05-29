package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee emp=new Employee();
		emp.setEcity("Mnagalore");
		emp.setEname("John");
		
		Transaction tx=session.beginTransaction();	
		
		session.save(emp);
		
		tx.commit();

		session.close(); // Detached State

		sessionFactory.close();

		/*
		 * Transaction tx=session.beginTransaction();
		 * 
		 * Employee emp=new Employee(); emp.setEid(1);
		 * 
		 * session.delete(emp);
		 * 
		 * 
		 * tx.commit();
		 * 
		 * 
		 * 
		 * Employee emp=session.get(Employee.class, 2);
		 * 
		 * if(emp!=null) { emp.setEcity("Hyderabad"); session.update(emp); } else {
		 * System.out.println("Employee with Given ID not available"); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Employee emp = (Employee) session.load(Employee.class, 3);// Lazy Loading of
		 * object System.out.println("Employee Name:" + emp.getEname());
		 * 
		 * 
		 * // Employee emp=(Employee)session.get(Employee.class,2); // Early Loading of
		 * // Object
		 * 
		 * 
		 * if(emp!=null) { System.out.println("Employee ID:"+emp.getEid());
		 * System.out.println("Employee Name:"+emp.getEname());
		 * System.out.println("Employee City:"+emp.getEcity()); } else {
		 * System.out.println("Sorry, Employee with Given ID not available"); }
		 * 
		 * 
		 * // Employee emp=new Employee(2,"Praveen","Bangalore");
		 * 
		 * 
		 * Transaction tx=session.beginTransaction();
		 * 
		 * session.save(emp);// Insert an object into database table
		 * 
		 * tx.commit();
		 * 
		 */

	}
}
