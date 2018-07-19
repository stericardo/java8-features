package com.stevenprogramming.java8.service.impl;

import com.stevenprogramming.java8.domain.Employee;
import com.stevenprogramming.java8.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Steven", "CR"));
        list.add(new Employee(2, "Arlin", "Her"));
        return list;
    }

}
