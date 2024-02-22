package com.kodnest;

import java.util.ArrayList;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;



class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
//       try {
//        //Begin transaction
//        Transaction tr = session.beginTransaction();
////        Product p = new Product(1,"mobile");
////        session.save(p);
//        Product p = new Product();
//        Customer c = new Customer(3,"Smi", p);
////        session.update(s);
////        session.delete(s);
//        p.setPid(3);
//       // p.setPname("mobile");
//        session.save(p);
//        session.save(c);
//        
//       
//        
//        tr.commit();
//    } catch (Exception e) {
// 	   e.printStackTrace();
//    }
//    finally {
//   //close the session and factory
//        session.close();
//        factory.close();
//        
////        Student s =session.get(Student.class,1);
////        System.out.println(s.getId() +"-----" + "----"+s.getName());
////        
////        System.out.println("++++++++++++++++");
////        
////        System.out.println(s);
////        tr.commit();
////        session.close();
////        factory.close();
////        
//        
//    } 
//       
//    }
        
        
        try {
        	Transaction tr = session.beginTransaction();
        	Product p1 = new Product();
        	p1.setPid(1);
        	p1.setPname("prod-1");
        	session.save(p1);
        	
        	Product p2 = new Product();
        	p2.setPid(2);
        	p2.setPname("prod-2");
        	session.save(p2);
        	
        	Product p3 = new Product();
        	p3.setPid(3);
        	p3.setPname("prod-3");
        	session.save(p3);
        	
        	Product p4 = new Product();
        	p4.setPid(4);
        	p4.setPname("prod-4");
        	session.save(p4);
        	
        	Product p5 = new Product();
        	p5.setPid(5);
        	p5.setPname("prod-5");
        	session.save(p5);
        	
        	Product p6 = new Product();
        	p6.setPid(6);
        	p6.setPname("prod-6");
        	session.save(p6);
        
        	
        	ArrayList<Product> al = new ArrayList<Product>();
        	al.add(p1);
        	al.add(p2);
        	al.add(p3);
        	al.add(p4);
        	al.add(p5);
        	al.add(p6);
        	
            ArrayList<Product> al2 = new ArrayList<Product>();
            al2.add(p1);
            al2.add(p2);
            al2.add(p5);
            al2.add(p6);
        	
        	Customer c1 = new Customer(1,"Sush",al);
        	session.save(c1);
        	
        	
        	Customer c2 = new Customer(2,"Smi",al);
        	session.save(c2);
        	
        	Customer c3 = new Customer(3,"Sacchi",al);
        	session.save(c3);
        	
        	Customer c4 = new Customer(4,"Rums",al);
        	session.save(c4);
        	
        	Customer c5 = new Customer(5,"Sacchi",al2);
        	session.save(c5);
        	
        	Customer c6 = new Customer(6,"Rums",al2);
        	session.save(c6);
     
      tr.commit();  
    } catch (Exception e) {
 	   e.printStackTrace();
    }
    finally {
       //close the session and factory
    	        session.close();
    	        factory.close();
    }
        
        
    }     
        
}
