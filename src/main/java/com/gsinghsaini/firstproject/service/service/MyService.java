package com.gsinghsaini.firstproject.service.service;

import java.util.Optional;

public interface MyService {

    Employee addEmployee(Employee employee);

    Optional<Employee> getEmpByID(Integer id);

    Optional<Employee> getEmpByName(String name);

    void deleteEmployee(Integer id);
}
