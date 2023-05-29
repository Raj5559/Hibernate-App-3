package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PaymentClient {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Cheque cheque=new Cheque();
		cheque.setAmount(787878);
		cheque.setChequeType("Post-Dated-Cheque");
		
		Transaction tx = session.beginTransaction();
		
		session.save(cheque);
		
		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
