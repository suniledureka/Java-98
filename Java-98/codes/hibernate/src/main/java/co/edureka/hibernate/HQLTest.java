package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Anup'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentId IN (101, 202, 305, 104, 105)";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName LIKE 'S%'";
		
		Query<Student> query = session.createQuery(hql, Student.class);
		List<Student> students = query.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters		
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(0, 101);
		query.setParameter(1, 105);
		List<Student> students = query.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters		
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minsid", 105);
		query.setParameter("maxsid", 200);
		List<Student> students = query.getResultList();
		printStudents(students);
		*/
		
		//--DML operation with HQL
		session.beginTransaction();
		String hql = "update co.edureka.hibernate.entity.Student set studentName='Anup Kumar', studentEmail='anup@edureka.co' where studentId=102";
		Query query = session.createQuery(hql);
		int n = query.executeUpdate();
		System.out.println("students updated = " + n);
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

	private static void printStudents(List<Student> students) {
		for(Student st : students) {
			System.out.println(st);
			try {
				Thread.sleep(500);
			}catch(Exception ex) {}
		}		
	}
}