//package com.fdmgroup.employeeapp.repository;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.fdmgroup.employeeapp.Repository.EmployeeRepository;
//import com.fdmgroup.employeeapp.model.Employee;
//
//public class EmployeeRepositoryTest {
//	@Autowired
//	private EmployeeRepository employeeRepo;
//	
//	@Test
//	void test_repositoryReturnsTrue_ifEmployeeExistsWithFnameAndLname() {
//		Employee employee = new Employee(0, "ben", "yoo", "11-01-21", "2254 mira vista ave montrose ca 91020");
//		employeeRepo.save(employee);
//		assertTrue(employeeRepo.existsByFullName(employee.getFirstName(), employee.getLastName()));
//	}
//}
