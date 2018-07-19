package com.stevenprogramming.java8.controller;

import com.stevenprogramming.java8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeServiceController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("employees", employeeService.getAllEmployee());
        return "employees";
    }
}
