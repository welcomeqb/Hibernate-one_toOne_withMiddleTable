package com.hib.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.entities.Role;
import com.hib.entities.User;
import com.hib.init.HibernateUtil;

public class DemoFirst {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Role role1 = new Role();
		role1.setRole("admin2");

		Role role2 = new Role();
		role2.setRole("regular2");
		
		
		User user1 = new User("Alex2", "111111");
		User user2 = new User("bbb2", "2222");
		
		
		
		
		user1.setRole(role1);
		
		
		
		user2.setRole(role2);
		
		session.save(user1);
		session.save(user2);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
