package com.ExcelSheetJava;

public class Details {
private String name;
private String description;
private String id;


public Details(String name, String description, String id) {
	super();
	this.name = name;
	this.description = description;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String toString(){
    return "Id:"+id+" name: "+ name+" description: "+ description;
}
}
