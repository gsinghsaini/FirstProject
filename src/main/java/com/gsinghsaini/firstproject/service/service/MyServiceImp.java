package com.gsinghsaini.firstproject.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyServiceImp implements MyService {

    private final MyRepository myRepository;

    @Autowired
    public MyServiceImp (MyRepository myRepository){
        this.myRepository = myRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return myRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmpByID(Integer id) {
        return myRepository.findById(id);
    }

    @Override
    public Optional<Employee> getEmpByName(String name) {
        return myRepository.findByName(name);
    }

    @Override
    public void deleteEmployee(Integer id) {
         myRepository.deleteById(id);
    }

}
