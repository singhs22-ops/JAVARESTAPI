package com.companytest.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface Javarestrepository extends CrudRepository<Product, Long>{

}
