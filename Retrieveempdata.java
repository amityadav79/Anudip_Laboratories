package com.example.employeemanagement;
import org.hibernate.Session;

import com.example.employeemanagement.Utils.HibernateUtils;
import com.example.employeemanagement.entities.Employee;

public class Retrieveempdata {

	public static void main(String[] args) 
	{
		 /*----- Creating Session using SessionFactory -------------*/
    	Session session=HibernateUtils.getSessionFactory().openSession();
    	/*-----------------------------------------------------------------*/
    	/*---- Fetching data of Entity ------*/
    	Employee e1=session.get(Employee.class, "e101");
    	Employee e2=session.get(Employee.class, "e102");
    	Employee e3=session.get(Employee.class, "e103");
    	Employee e4=session.get(Employee.class, "e104");
    	Employee e5=session.get(Employee.class, "e105");
    	System.out.println("------------------------------------------------------");
    	System.out.println(e1);
    	System.out.println(e2);
    	System.out.println(e3);
    	System.out.println(e4);
    	System.out.println(e5);
    	
    	/*----- Close sessionFactory -------------*/
    	HibernateUtils.shutdown();
	}

}
