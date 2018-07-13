package com.spring.tutorial;

public class Parent {

private int id;  
private String name;  
  
public Parent() {System.out.println("def cons");}  
  
public Parent(int id) {this.id = id;}  
  
public Parent(String name) {  this.name = name;}  
  
public Parent(int id, String name) {  
    this.id = id;  
    this.name = name;  
}  
  
void show(){  
    System.out.println(id+" "+name);  
}  
  
}  

