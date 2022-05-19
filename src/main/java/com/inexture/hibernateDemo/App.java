package com.inexture.hibernateDemo;

import java.util.List;

import javax.persistence.criteria.*;

import com.inexture.onetomany.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        System.out.println(factory);
        
        Session session = factory.openSession();

        MyStudent s1 = (MyStudent)context.getBean("myStudent");
        s1.setName("def");
        s1.setCity("ahmedabad");

        MyAddress a1 = (MyAddress)context.getBean("myAddress");
        a1.setHome("107");
        a1.setCountry("india");
        a1.setStudent(s1);

        MyAddress a2 = (MyAddress)context.getBean("myAddress");
        a2.setHome("108");
        a2.setCountry("canada");
        a2.setStudent(s1);

        @SuppressWarnings("unchecked")
        List<MyAddress> list = (List<MyAddress>)context.getBean("list");
        list.add(a1);
        list.add(a2);
        s1.setAddress(list);

        session.beginTransaction();
        session.save(s1);
        session.getTransaction().commit();
//        MyStudent s5 = (MyStudent)session.get(MyStudent.class, 1);
//        System.out.println(s5);
//        
//        MyTeacher t5 = (MyTeacher)session.get(MyTeacher.class, 3);
//        System.out.println(t5);
        
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<MyStudent> cr = cb.createQuery(MyStudent.class);
		Root<MyStudent> student = cr.from(MyStudent.class);
//		Root<MyAddress> address = cr.from(MyAddress.class);
		
//		cr.multiselect(student,address);

        Join<MyStudent, MyAddress> addressJoin = student.join("address", JoinType.INNER);

//		Predicate predicate = cb.like(student.get("address").get("country"), "in%");
		Predicate predicate = cb.like(student.get(MyStudent_.ADDRESS).get(MyAddress_.COUNTRY), "in%");

//        Predicate predicate = cb.like(addressJoin.get(MyAddress_.COUNTRY), "in%");

        cr.select(student).where(predicate);

		Query<MyStudent> query = session.createQuery(cr);
		List<MyStudent> results = query.getResultList();
		
		System.out.println(results);
        
        session.close();
        
        factory.close();
    }
}
