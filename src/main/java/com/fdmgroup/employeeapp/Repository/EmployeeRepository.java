package com.fdmgroup.employeeapp.Repository;


import com.fdmgroup.employeeapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByAddress_StreetContains(String street);
    List<Employee> findAllByAddress_CityContains(String city);
    List<Employee> findAllByAddress_StateContains(String state);
    List<Employee> findAllByAddress_CountryContains(String country);

}
