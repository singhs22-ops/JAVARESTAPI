/**
 * 
 */
package com.companytest.demo;

import javax.persistence.Id;

/**
 * @author DELL
 *
 */
public class nonPProduct {

	/**
	 * 
	 */
	public nonPProduct() {
		// TODO Auto-generated constructor stub
	}


	@Id
	//@Generated(strategy= GenerationType.IDENTITY)
	public int ID;
	public String name;
	@Override
	public String toString() {
		return "nonPProduct [ID=" + ID + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", seller=" + seller + ", location=" + location + ", waranty=" + waranty + ", serviceLocation="
				+ serviceLocation + ", getID()=" + getID() + ", getName()=" + getName() + ", getDescription()="
				+ getDescription() + ", getPrice()=" + getPrice() + ", getSeller()=" + getSeller() + ", getLocation()="
				+ getLocation() + ", getWaranty()=" + getWaranty() + ", getServiceLocation()=" + getServiceLocation()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String description;
	public int price;
	public String seller;
	public String location;
	public String waranty;
	public String serviceLocation;
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
	public String getWaranty() {
		return waranty;
	}
	public void setWaranty(String waranty) {
		this.waranty = waranty;
	}
	public String getServiceLocation() {
		return serviceLocation;
	}
	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}
	public nonPProduct(int iD2, String name, String description,
			int price, String seller,
			 String location, String waranty,
			String serviceLocation) {
		// TODO Auto-generated constructor stub
		
		this.ID=iD2;
		this.name=name;
		this.description=description;
		this.price=price;
		this.seller= seller;
		this.location=location;
		this.waranty= waranty;
		this.serviceLocation=serviceLocation;
		
		
	}
	
	
}
