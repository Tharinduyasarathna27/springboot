package lk.tharindu.sms.service;

import java.util.List;

import lk.tharindu.sms.model.Employee;

public interface EmployeeService {

		Employee save(Employee employee);
		List<Employee> fetchAllEmployee();
		Employee fetchEmployee(Employee employee);
}
