/**
 * 
 */
package com.companytest.demo;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author DELL
 *
 */
@Entity
public class Product {

	/**
	 * 
	 */
	public Product(int i, String name, String description,
			int price, String seller,
			 String location, String bestbefore, String Ingredients, int d) {
		// TODO Auto-generated constructor stub
		
		this.ID=i;
		this.name=name;
		this.description=description;
		this.price=price;
		this.seller= seller;
		this.location=location;
		this.bestbefore=bestbefore;
		this.Ingredients=Ingredients;
		this.healthrate= d;
		
		
	}
	@Id
	public int ID;
	
	public String name;
	
	public String description;
	
	public int price;
	
	public String seller;
	
	public String location;
	
	public String bestbefore;
	
	public String Ingredients;
	
	public Integer healthrate;
	
	public String toString() {
		return "Product [ID=" + ID + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", seller=" + seller + ", location=" + location + ", bestbefore=" + bestbefore + ", Ingredients="
				+ Ingredients + ", healthrate=" + healthrate + ", getBestbefore()=" + getBestbefore()
				+ ", getIngredients()=" + getIngredients() + ", getHealthrate()=" + getHealthrate() + ", getID()="
				+ getID() + ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getPrice()="
				+ getPrice() + ", getSeller()=" + getSeller() + ", getLocation()=" + getLocation() + "]";
	}
	public String getBestbefore() {
		return bestbefore;
	}
	public void setBestbefore(String bestbefore) {
		this.bestbefore = bestbefore;
	}
	public String getIngredients() {
		return Ingredients;
	}
	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}
	public Integer getHealthrate() {
		return healthrate;
	}
	public void setHealthrate(Integer healthrate) {
		this.healthrate = healthrate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
