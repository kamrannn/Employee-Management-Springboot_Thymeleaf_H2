package com.fdmgroup.employeeapp.controller;

import com.fdmgroup.employeeapp.model.Employee;
import com.fdmgroup.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String homepage() {
        // return template name
        return "index";
    }

    @GetMapping("/addEmployee")
    public String toAddEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        // return template name
        return "add-employee";
    }

    @GetMapping("/all_employees")
    public String listOfEmployees(Model model) {
        model.addAttribute("employeesList", employeeService.employeeList());
        return "show-employees";
    }

    @PostMapping("/processAddEmployee")
    public String processNewEmployee(@Valid Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-employee";
        } else {
            employeeService.addEmployee(employee);
            return "index";
        }
    }

    @GetMapping("/searchEmployee/by-street")
    public String searchEmployeeByStreet(@RequestParam("street") String streetAddress, Model model) {
        model.addAttribute("employeesList", employeeService.findEmployeesWithStreet(streetAddress));
        return "show-employees";
    }

    @GetMapping("/searchEmployee/by-city")
    public String searchEmployeeByCity(@RequestParam("city") String cityAddress, Model model) {
        model.addAttribute("employeesList", employeeService.findEmployeesWithCity(cityAddress));
        return "show-employees";
    }

    @GetMapping("/searchEmployee/by-state")
    public String searchEmployeeByState(@RequestParam("state") String state, Model model) {
        model.addAttribute("employeesList", employeeService.findEmployeesWithState(state));
        return "show-employees";
    }

    @GetMapping("/searchEmployee/by-country")
    public String searchEmployeeByCountry(@RequestParam("country") String country, Model model) {
        model.addAttribute("employeesList", employeeService.findEmployeesWithCountry(country));
        return "show-employees";
    }

}
