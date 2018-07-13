package com.spring.tutorial;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Child {  
    public static void main(String[] args) {  
          
    	ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
          
        Parent s=(Parent)context.getBean("e");  
        s.show();  
          
    }  
} 