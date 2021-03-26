package com.companytest.demo.callrestfunc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.companytest.demo.Product;
import com.companytest.demo.nonPProduct;


@Component
public class setandgetforProducts {

	private static final String Ingredients = "HIGHLY";


	private static final int ID = 99;	
	public setandgetforProducts() {
		super();
		// TODO Auto-generated constructor stub
		setperishableproductreq(1,"abc","xyz",1,"abc","xyz","aaa","xyz", 42);
		System.out.println("here!! adding constructor");
		setperishableproductreq(2,"abc","xyz",1,"abc","xyz","aaa","xyz", 42);
		setperishableproductreq(3,"abc","xyz",6,"abc","xyz","aaa","xyz", 42);
		setperishableproductreq(4,"abc","xyz",8,"abc","xyz","aaa","xyz", 42);
		setperishableproductreq(5,"abc","xyz",9,"abc","xyz","aaa","xyz", 42);
		setperishableproductreq(6,"abc","xyz",7,"abc","xyz","aaa","xyz", 42);
		setperishableproductreq(7,"abc","xyz",0,"abc","xyz","aaa","xyz", 42);
		
		
		setnonperishableproductreq(1,"abc","xyz",12,"abc","xyz","aaa","xyz");
		setnonperishableproductreq(2,"abc","xyz",2,"abc","xyz","aaa","xyz");
		setnonperishableproductreq(3,"abc","xyz",2,"abc","xyz","aaa","xyz");
		setnonperishableproductreq(4,"abc","xyz",1,"abc","xyz","aaa","xyz");
		setnonperishableproductreq(5,"abc","xyz",1,"abc","xyz","aaa","xyz");
		setnonperishableproductreq(6,"abc","xyz",2,"abc","xyz","aaa","xyz");
		setnonperishableproductreq(7,"abc","xyz",2,"abc","xyz","aaa","xyz");
	}

	
	Product obj1;
	
	nonPProduct obj2;
	List<Product> perishable = new ArrayList<Product>();
	List<nonPProduct> nonPerishable = new ArrayList<nonPProduct>();
	
	public int setperishableproductreq(int i, String name, String description,
			int price, String seller,
	 String location, String bestbefore, String Ingredients, int d) {
		try{
			obj1 = new Product( i,  name,  description,
				  price,  seller,
				  location,  bestbefore,  Ingredients,  d);
			obj1.setID(4);obj1.setName(name);obj1.setDescription(description);obj1.setPrice(price);
			obj1.setSeller(seller); obj1.setLocation(location);obj1.setBestbefore(bestbefore);
			obj1.setIngredients(Ingredients);obj1.setHealthrate(d);
			System.out.println("object Product :"+obj1);
			
			this.perishable.add(obj1);
		}
		catch(Exception e) {
			System.out.println("supriya:::"+e.getMessage());
		}
		
		if(obj1!=null)
		{	
			return 1;
		}
		return 0;
		
		
	}
	public int setnonperishableproductreq(int ID, String name, String description,
			int price, String seller,
			 String location, String waranty,
			String serviceLocation) {
			try {	
				obj2 = new nonPProduct( ID,  name,  description,
						  price,  seller,
						  location, waranty, serviceLocation  );
				obj2.setID(ID);obj2.setName(name);obj2.setDescription(description); 
				obj2.setPrice(price);obj2.setSeller(seller); obj2.setLocation(serviceLocation);
				obj2.setWaranty(waranty); obj2.setServiceLocation(serviceLocation);
				System.out.println("NONPERISHABLE OBJECT "+obj2);
				
				nonPerishable.add(obj2);
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				if(obj2!=null)
							{	
					return 1;
				}
				return 0;
				
	}
	
	public List<Product> getPerishableObj(){
		System.out.println("LISTOF OBJ1"+this.perishable);
		return this.perishable;
		
	}

	public List<nonPProduct> getnonPerishableObj(){
		System.out.println("LISTOF OBJ2"+this.nonPerishable);
		return this.nonPerishable;
	}
	
}
