package com.demo.multitenant.service;

import com.demo.multitenant.bean.Employee;
import com.demo.multitenant.repo.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// @Scheduled(fixedRate = 5000L)
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> getAll() throws SQLException {
		return employeeRepository.findAll();

	}

	public Employee get(Long id) {
		return employeeRepository.findById(id).get();
	}

	public Employee getByName(String name) {
		return employeeRepository.findByName(name);
	}

	public void delete(String name) {
		employeeRepository.deleteByName(name);
	}
}
