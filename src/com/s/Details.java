package com.s;
import javax.management.Query;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.n.model.Student;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory s= new  Configuration().configure().buildSessionFactory() ;
Session s1=s.openSession();
Transaction t=s1.beginTransaction();
Student n= new Student(1,"ramana");
Student n1= new Student(1,"ramana");
Student n2= new Student(1,"ramana");
s1.save(n);
s1.save(n1);
s1.save(n2);
t.commit();
s1.close();
s.close();
	}
}
