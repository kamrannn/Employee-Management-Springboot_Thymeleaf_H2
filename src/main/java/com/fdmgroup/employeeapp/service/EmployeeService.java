package com.fdmgroup.employeeapp.service;

import com.fdmgroup.employeeapp.Repository.EmployeeRepository;
import com.fdmgroup.employeeapp.model.Address;
import com.fdmgroup.employeeapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public boolean addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return true;
    }

    public List<Employee> employeeList() {
        List<Employee> employees = employeeRepo.findAll();
        return employees;
    }

    public List<Employee> findEmployeesWithStreet(Address address) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Employee> findEmployeesWithStreet(String street) {
        return employeeRepo.findAllByAddress_StreetContains(street);
    }

    public List<Employee> findEmployeesWithCity(String city) {
        return employeeRepo.findAllByAddress_CityContains(city);
    }

    public List<Employee> findEmployeesWithState(String state) {
        return employeeRepo.findAllByAddress_StateContains(state);
    }
    public List<Employee> findEmployeesWithCountry(String state) {
        return employeeRepo.findAllByAddress_CountryContains(state);
    }


}
