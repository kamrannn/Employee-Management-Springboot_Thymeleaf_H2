package com.fdmgroup.employeeapp.controller;

import com.fdmgroup.employeeapp.model.Address;
import com.fdmgroup.employeeapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        super();
        this.addressService = addressService;
    }


    // create method handler to display list of address
    @GetMapping("/addAddress")
    public String toAddAddress(Model model) {
        model.addAttribute("address", new Address());
        return "add-address";
    }

}
