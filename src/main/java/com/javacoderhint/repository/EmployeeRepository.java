package com.javacoderhint.repository;

import com.javacoderhint.model.Employee;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {

}