package com.chanel.practice_eight;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chanel.entity.Employee;


public class PracticeEightMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//5.SAVING OBJECTS
			//Creating employee objects
			Employee emp1 = new Employee("Ege", "Sanel", "softtech");
			Employee emp2 = new Employee("Julian", "Casablancas", "Strokes");
			Employee emp3 = new Employee("Kobe", "Bryant", "LaLakers");

			session.beginTransaction();
			System.out.println("Saving employee objects...");
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			
			//commit
			session.getTransaction().commit();
			System.out.println("Done saving...");
			
			//6.DEVELOP CODE TO RETRIEVE AN OBJECT BY PRIMARY KEY
			int id = 1;
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("Retrieving user data with primary key: " + id);

			Employee tempEmp = session.get(Employee.class, id);

			
			System.out.println("employee with id: " + id + " is named " + tempEmp.getFirsName());

			session.getTransaction().commit();
			
			
			//7.Develop code to query objects to find employees for a given company.
			String company = "softtech";
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			List<Employee> employeeList = session.createQuery("from Employee").getResultList();
			System.out.println("All employees...");
			displayEmployees(employeeList);

			
			System.out.println("\n\nLoading employees of company: " + company);
			employeeList = session.createQuery("from Employee e where e.company='softtech'").getResultList();
			displayEmployees(employeeList);
			session.getTransaction().commit();

			//8.Develop code to delete an object by primary key.
			int primarykey = 3;
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Employee deletedEmp = session.get(Employee.class,primarykey);
			System.out.println("Deleting row with id: " + primarykey);
			session.delete(deletedEmp);
			session.getTransaction().commit();
			System.out.println("Done deleting row with id: " + primarykey);

			//delete from Student where id=4
			
			
			
		} finally {


			factory.close();
		}

	}

	private static void displayEmployees(List<Employee> employeeList) {
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}

}
