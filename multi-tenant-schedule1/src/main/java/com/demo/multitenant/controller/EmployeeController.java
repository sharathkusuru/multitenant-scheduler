package com.demo.multitenant.controller;

import com.demo.multitenant.bean.Employee;
import com.demo.multitenant.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
 
    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Employee Employee) {
        employeeService.save(Employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getEmployee/all", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getAll() throws SQLException {
        List<Employee> cities = employeeService.getAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> get(@PathVariable(value = "id") Long id) {
        Employee Employee = employeeService.get(id);
        return new ResponseEntity<>(Employee, HttpStatus.OK);
    }

    @RequestMapping(value = "/getEmployeebyname/{name}", method = RequestMethod.GET)
    public ResponseEntity<Employee> get(@PathVariable(value = "name") String name) {
        Employee Employee = employeeService.getByName(name);
        return new ResponseEntity<>(Employee, HttpStatus.OK);
    }

    @RequestMapping(value = "deletebyname/{name}", method = RequestMethod.DELETE)
    public ResponseEntity<Employee> delete(@PathVariable(value = "name") String name) {
        employeeService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
