package com.fdmgroup.employeeapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fdmgroup.employeeapp.service.EmployeeService;

public class EmployeeControllerTest {
	@Autowired
	MockMvc mvc;
	
	@MockBean
	EmployeeService employeeService;
	
	@Test
	void test_toAddEmployee_returnsCorrectView() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/addEmployee")).andExpect(MockMvcResultMatchers.view().name("add-employee"));
	}
}
