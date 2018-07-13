package com.Collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMap extends Thread {
	
	ConcurrentHashMap<Integer,String> ch=new ConcurrentHashMap<>();
	
	public void run() {
		ch.put(101, "srikanth");
		ch.put(102,"mourya");
		ch.put(103,"vinay");
		ch.put(1,"rahul");
		ch.put(104,"venu");
		for(Map.Entry m: ch.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println(ch);
			
		}
		}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConHashMap c=new ConHashMap();
c.start();


	}

}
