package com.priyam.learnspring.MasterSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyam.learnspring.MasterSpring.Repository.modal.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}