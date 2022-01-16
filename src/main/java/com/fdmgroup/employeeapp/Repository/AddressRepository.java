package com.fdmgroup.employeeapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.employeeapp.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	
}
