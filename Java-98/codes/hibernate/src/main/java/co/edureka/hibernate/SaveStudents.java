package co.edureka.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y")) {
			System.out.println("enter student name & email:");
			String name = sc.next();
			String email = sc.next();
			
			Student st = new Student(name, email);
			session.save(st);
			
			System.out.print("\ndo you want to save more students[Y/N]: ");
			req = sc.next();
		} //while
		
		System.out.println();
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}
}
