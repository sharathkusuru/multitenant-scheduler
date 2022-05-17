package com.demo.multitenant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.multitenant.config.DataSourceConfig;

public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig, Long> {
    DataSourceConfig findByName(String name);
}
