package com.innominds.basic;

public class CustomerService {
	
	public Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException(555, "Name is empty!");
        }

        return new Customer(name);

    }

}
