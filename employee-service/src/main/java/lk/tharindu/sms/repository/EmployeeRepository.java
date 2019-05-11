package lk.tharindu.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.tharindu.sms.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
