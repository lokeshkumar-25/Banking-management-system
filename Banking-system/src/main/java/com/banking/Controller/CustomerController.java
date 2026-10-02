package com.banking.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Entity.CustomerEntity;
import com.banking.Service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService=customerService;
	}
	@PostMapping
	public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping
	public List<CustomerEntity> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	public CustomerEntity getSingleCustomer(@PathVariable Long id){
		return customerService.getSingleCustomer(id);
	}
	
	@PutMapping("/{id}")
	public CustomerEntity UpdateCustomer(@PathVariable Long id,@RequestBody CustomerEntity customerDetails) {
		return customerService.updateCustomer(id, customerDetails);
	}
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
	 customerService.deleteCustomer(id);
	 return "Customer Details Deletedd" ;
	}
}
 