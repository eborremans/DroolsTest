package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	List<Person> children;
	int age;
	
	public Person()	{
		children = new ArrayList<Person>();
	}
	public Person(String firstName, int age)	{
		this();
		
		this.firstName = firstName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void addChild(Person child) {
		children.add(child);
	}
	public List<Person> getChildren() {
		return children;
	}
	public int getNrOfChildren() {
		return children.size();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
