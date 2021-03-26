package com.companytest.demo.callrestfunc;

import java.util.ArrayList;
import java.util.List;

public class LeafGJSON {

	public LeafGJSON() {
		// TODO Auto-generated constructor stub

	}

	public String status;
	public List<animals> result;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<animals> getResult() {
		return result;
	}
	public void setResult(List<animals> result) {
		this.result = result;
	}
	
	public animals anim;
	public List<animals> objlist = new ArrayList<animals>();
	public void Assignanimal(int Id, String type, int age, String sex, String name) {
		
		anim = new animals(Id,type, age, sex, name);
		anim.setId(Id);
		anim.setType(type);
		anim.setAge(age);
		anim.setSex(sex);
		anim.setName(name);
		
		this.objlist.add(anim);		
		
	}
	
	public List<animals> getanimalsarray(){
		System.out.println("animalarray"+ this.objlist);
		return this.objlist;
	}
}
