package com.demo.multitenant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.multitenant.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findByName(String name);

    void deleteByName(String name);
}
