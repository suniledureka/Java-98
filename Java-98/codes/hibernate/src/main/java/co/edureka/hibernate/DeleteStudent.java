package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//approach-1 to delete a student
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.delete(st);
		*/
		
		//approach-2 to delete a student
		Student st = session.get(Student.class, 112);	
				
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}else {
			System.err.println("no matching student found!!");
		}		
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}
}
