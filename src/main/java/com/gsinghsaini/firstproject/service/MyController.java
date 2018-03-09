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

    @RequestMapping(path = "/user/id/{id}", method = RequestMethod.GET)
    public Optional<Employee> getEmployeeById(@PathVariable Integer id) {
        return myService.getEmpByID(id);
    }

    @RequestMapping(path = "/user/name/{name}", method = RequestMethod.GET)
    public Optional<Employee> getEmployeeByName(@PathVariable String name) {
        return myService.getEmpByName(name);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Integer id){
        myService.deleteEmployee(id);
    }

}

/* Combining getEmployeeById and getEmployeeByName methods

 @RequestMapping(path = "/user/{identifier}", method = RequestMethod.GET)
    public Optional<Employee> getEmployeeDetail(@PathVariable String identifier, @RequestParam(name = "by", required = false) String selector) {
        if ("name".equals(selector))
            return myService.getEmpByName(identifier);
        //if ("id".equals(selector))
        return myService.getEmpByID(Integer.valueOf(identifier));
        //return null;
    }
 */
