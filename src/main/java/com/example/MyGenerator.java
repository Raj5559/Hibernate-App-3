package com.example;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Employee emp=(Employee)object;
		String ename=emp.getEname();
		
		String s=UUID.randomUUID().toString();
		
		Random random=new Random();
		return random.nextInt(10)+ename.length()+1+s.length();
		
		
	}

	
	
	
}
