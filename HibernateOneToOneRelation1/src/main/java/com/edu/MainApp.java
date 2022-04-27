package com.edu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setStuId(1);
		s.setStuName("Shalini");
		s.setCourse("IT");
		
		Address a=new Address();
		a.setNo(8);
		a.setStreet("New Street");
		a.setCity("Karaikal");
		a.setDistrict("Karaikal");
		a.setState("Pondicherry");
		a.setPincode(609609);
		a.setSt(s);

		Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		sess.save(s);
		sess.save(a);
		tx.commit();
	}

}
