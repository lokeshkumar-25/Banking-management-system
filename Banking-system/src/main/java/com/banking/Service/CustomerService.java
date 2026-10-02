package com.banking.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banking.Entity.CustomerEntity;
import com.banking.Repository.CustomerRepository;

@Service
public class CustomerService {
	   
	private final CustomerRepository customerRepository ;
	
	public CustomerService(CustomerRepository  customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	public CustomerEntity createCustomer(CustomerEntity customer) {
		return customerRepository.save(customer);
		
	}
	
	public List<CustomerEntity> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public CustomerEntity getSingleCustomer(Long id) {
		return customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer Not Found"));
	}
	
	public CustomerEntity updateCustomer(Long id, CustomerEntity customerDetails) {
		CustomerEntity customer=customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer Not Found"));
		
		customer.setFrist_name(customerDetails.getFrist_name());
		
		customer.setLast_name(customerDetails.getLast_name());
		
		customer.setEmail(customerDetails.getEmail());
		
		customer.setPhone(customerDetails.getPhone());
		
		return customerRepository.save(customer);
		
	}
	
	public void deleteCustomer(Long id) {
		if(!customerRepository.existsById(id)) {
			throw new RuntimeException("Customer Not Found");
		}
		 customerRepository.deleteById(id);
	}

}
