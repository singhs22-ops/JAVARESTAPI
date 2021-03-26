package com.companytest.demo.callrestfunc;
import javax.persistence.*;

public class animals {
	
	public animals(int Id, String type, int age, String sex, String name){
		setId(5);
		setType("Monkey");setAge(12);
		setSex("Male");
		setName("Mine");
	}
	@Id
	public int Id;
	public String type;
	public int age;
	public String sex;
	public String name;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
