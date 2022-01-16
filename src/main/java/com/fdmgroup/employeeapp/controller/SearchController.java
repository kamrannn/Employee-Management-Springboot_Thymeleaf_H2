package com.fdmgroup.employeeapp.controller;

import com.fdmgroup.employeeapp.model.Address;
import com.fdmgroup.employeeapp.model.Employee;
import com.fdmgroup.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    EmployeeService employeeService;

    @Autowired
    public SearchController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }


    @PostMapping("/searchEmployee")
    public String searchByAddress(@RequestParam Address address, Model model) {
        List<Employee> matchingEmployees = employeeService.findEmployeesWithStreet(address);
        if (matchingEmployees.isEmpty()) {
            model.addAttribute("isEmpty", "No employees have been found at this address.");
        } else {
            model.addAttribute("employees", matchingEmployees);
        }
        return "show-employees";
    }
}
