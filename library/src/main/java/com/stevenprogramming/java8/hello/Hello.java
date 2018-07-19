package com.stevenprogramming.java8.hello;

import com.stevenprogramming.java8.domain.Employee;
import com.stevenprogramming.java8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class Hello {

    @Autowired
    EmployeeService employeeService;

    @PostConstruct
    public void setEmployeeService(){
        List<Employee> employees = employeeService.getAllEmployee();
        for (Employee e : employees){
            System.out.println("\n\n" + e.getName());
        }
    }
}
