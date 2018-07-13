package com.Collections;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copyonarraylist extends Thread {

	 
	    static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	 
	    public void run()
	    {
	        // Child thread trying to
	        // add new element in the
	        // Collection object
	        l.add("D");
	    }
	 
	    public static void main(String[] args) 
	                throws InterruptedException
	    {
	        l.add("A");
	        l.add("B");
	        l.add("c");
	 
	        // We create a child thread 
	        // that is going to modify 
	        // ArrayList l.
	        Copyonarraylist t = new Copyonarraylist();
	        t.start();
	         
	        Thread.sleep(1000);
	         
	        // Now we iterate through 
	        // the ArrayList and get
	        // exception.
	        java.util.Iterator itr = l.iterator();
	        while (itr.hasNext()) {
	            String s = (String)itr.next();
	            System.out.println(s);
	            Thread.sleep(1000);
	        }
	        System.out.println(l);
	    }
	}