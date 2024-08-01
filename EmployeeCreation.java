package com.example.employeemanagement;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.employeemanagement.Utils.HibernateUtils;
import com.example.employeemanagement.entities.Employee;


public class EmployeeCreation 
{
    public static void main( String[] args )
    {
    	/*----- Creating Session using SessionFactory -------------*/
    	Session session=HibernateUtils.getSessionFactory().openSession();
    	/*-----------------------------------------------------------------*/
    	/*----- Creating Transaction object --------------*/
    	Transaction transaction=session.beginTransaction();
    	/*----------------------------------------------------------------------*/
    	/*----  Create object of Product Entity ------------*/
		/*----  Here entity are in transient state ---------*/
		Employee emp1= new Employee("e101","Karan", 20000, 34);
		Employee emp2= new Employee("e102","Karan", 10000, 33);
		Employee emp3= new Employee("e103","Karan", 50000, 25);
		Employee emp4= new Employee("e104","Karan", 60000, 34);
		Employee emp5= new Employee("e105","Karan", 80000, 54);
		/*------ Persist the entity or insert into table ------------*/
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		/*----- Commit transaction -----------*/
		transaction.commit();
		/*---------------------------------------------------------*/
		System.out.println("Product successfully inserted");
		/*--------- Close sessionFactory -----------*/
		HibernateUtils.shutdown();
    }
}
