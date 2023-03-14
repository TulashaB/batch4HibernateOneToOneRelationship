package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	
	public static void main(String[] args) {
		
		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        //--------------------------
  
     Author a1=new Author("Tulasha","Tula@gmail.com");   
     
     Book b1=new Book("java","about core java",150,a1);
       session.save(b1);  //save child record, by default record of author will be saved
                            // how?-- because we are using author
     
     //create Authors  
       Author a2=new Author("Tila","Tila@gmail.com");   
       Author a3=new Author("Tula","tula@yahoo.com");
       
       //create Books
       Book b2=new Book("java","about core java",50,a2);
       Book b3=new Book("SQL", "about SQL",100,a3);
      
       
       //save child records by default parent table record will be saved
        session.save(b2);
        session.save(b3);
      
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------
        
        
        
        
        
        
        
        
	}
}
