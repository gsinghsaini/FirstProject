package com.gsinghsaini.firstproject.service;

import com.gsinghsaini.firstproject.service.service.Employee;
import com.gsinghsaini.firstproject.service.service.MyService;
import com.gsinghsaini.firstproject.service.service.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MyController {

    private MyService myService;

    private MyRepository myRepository;

    @Autowired
    public MyController(MyService myService, MyRepository myRepository) {
        this.myService = myService;
        this.myRepository = myRepository;
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee) {
        return myService.addEmployee(employee);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public Optional<Employee> getEmployeeById(@PathVariable Integer id) {
        return myService.getEmpByID(id);
    }

    @RequestMapping(path = "/user/{name}", method = RequestMethod.GET)
    public Optional<Employee> getEmployeeByName(@PathVariable String name) {
        return myService.getEmpByName(name);
    }



}
