package com.fdmgroup.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.employeeapp.Repository.AddressRepository;
import com.fdmgroup.employeeapp.model.Address;

@Service
public class AddressService {
	
	private AddressRepository addressRepo;
	
	@Autowired
	public AddressService(AddressRepository addressRepo) {
		super();
		this.addressRepo = addressRepo;
	}


	public List<Address> getAllAddress() {
		return addressRepo.findAll();
	}
}
