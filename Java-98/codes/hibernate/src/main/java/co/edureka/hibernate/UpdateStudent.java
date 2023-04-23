package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//approach-1 to update a student
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.update(st);
		*/
		
		//approach-2 to update a student
		Student st = session.get(Student.class, 109);	
				
		if(st != null) {
			System.out.println(st);
			st.setStudentEmail("srikanth@gmail.com"); //dirty object
		}else {
			System.err.println("no matching student found!!");
		}		
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}
}
