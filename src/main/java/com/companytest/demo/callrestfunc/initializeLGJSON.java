package com.companytest.demo.callrestfunc;

import java.util.List;

public class initializeLGJSON {

	public initializeLGJSON() {
		// TODO Auto-generated constructor stub
		assignanimalsfunc();
		System.out.println("initializeJSON");
		retLeafJSON();
		
	}
	
	LeafGJSON leafassign = new LeafGJSON();
	
	
	public LeafGJSON retLeafJSON() {
		leafassign.setStatus("OK");
		System.out.println("initializeJSON2");
		
		leafassign.setResult(leafassign.getanimalsarray());
		
		System.out.println(leafassign);
		return this.leafassign;
	}
	
	  int assignanimalsfunc() {
		try {
		leafassign.Assignanimal(0, "cat", 11, "F", "Milo");
		leafassign.Assignanimal(1, "dog", 15, "F", "Buddy");
		leafassign.Assignanimal(2, "cow", 14, "F", "Nettle");
		return 1;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
		
	
	public LeafGJSON initialize0bj() {
		return this.leafassign;
	}
	
	public animals getbyID(int id) {
		System.out.println("here");
		List<animals> findbyId ;
		findbyId= leafassign.getanimalsarray();
		
		for(animals ids: findbyId ) {
			if(id == ids.getId())
				return ids;
		}
		
		return null;
		
	}
	
	public animals getbyName(String name) {
		System.out.println("here");
		List<animals> findbyId ;
		findbyId= leafassign.getanimalsarray();
		
		for(animals ids: findbyId ) {
			System.out.println(ids.getAge()+ids.getName() );
			if(name == ids.getName())
				System.out.println("WEAREHERE0");
				return ids;
		}
		
		return null;
		
	}
//getbyGender
	public animals getbyGender(String sex) {
		System.out.println("here");
		List<animals> findbyId ;
		findbyId= leafassign.getanimalsarray();
		
		for(animals ids: findbyId ) {
			System.out.println(ids.getSex()+ids.getName() );
			if(sex == ids.getSex())
				System.out.println("WEAREHERE0");
				return ids;
		}
		
		return null;
		
	}
	
	
	
}
