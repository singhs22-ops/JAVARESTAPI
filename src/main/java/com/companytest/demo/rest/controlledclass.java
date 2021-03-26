package com.companytest.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.companytest.demo.Product;
import com.companytest.demo.nonPProduct;
import com.companytest.demo.callrestfunc.LeafGJSON;
import com.companytest.demo.callrestfunc.animals;
import com.companytest.demo.callrestfunc.initializeLGJSON;
import com.companytest.demo.callrestfunc.setandgetforProducts;

@CrossOrigin(origins="http;//localhost:4200")
@RestController
@RequestMapping("/leaf")
public class controlledclass {

	public controlledclass() {
		// TODO Auto-generated constructor stub
	}
	
	

	//demo functions
	
	Product product = new Product(0, "start", "start", 0, "start", "start", "start", "start", 10);

	
	List<Product> obj= new ArrayList<>();
	initializeLGJSON leafObj = new initializeLGJSON();
	
	
	setandgetforProducts obj1 = new setandgetforProducts();

	nonPProduct obj2;
	
	@GetMapping("/home")
	public String home() {
		return "HHHHH";
	}
	
	@GetMapping("/product")
	public List<Product> prod() {
		return this.obj1.getPerishableObj();
		
	}
	
	@GetMapping("/nonPproduct")
	public List<nonPProduct> nonPprod() {
		return this.obj1.getnonPerishableObj();
		
	}
	
	@GetMapping("/productDetails")
	private setandgetforProducts setandgetforProducts() {
		// TODO Auto-generated method stub
		return this.obj1;
	}

	@GetMapping("/home123/{homeid}")
	public String gethomeid(@PathVariable String homeid) {
		return "HHHHH"+homeid;
	}
	
	
	@PostMapping(path ="/postreqwithbody")
	public int postreqwithbody(@RequestBody Product product) {
		return 212;
	}
	@DeleteMapping(path = "/{username}")
    public void delete(@PathVariable("username") String username) {
        return;
    }
	//
	
	@PostMapping("/getLeafJSON")
	public LeafGJSON getLeafJSON() {
		return this.leafObj.initialize0bj();
	}
	
	@PostMapping("/getLeafJSONbyid/{id}")
	public animals getLeafJSONbyid(@PathVariable int id) {
		return this.leafObj.getbyID(id);
	}
	
	@PostMapping("/getLeafJSONbyname/{name}")
	public animals getLeafJSONbyname(@PathVariable String name) {
		System.out.println(name);
		return this.leafObj.getbyName(name);
	}
	
	@PostMapping("/getLeafJSONbysex/{sex}")
	public animals getLeafJSONbySex(@PathVariable String sex) {
		System.out.println(sex);
		return this.leafObj.getbyGender(sex);
	}
	
}
