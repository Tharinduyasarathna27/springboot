package lk.tharindu.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.tharindu.sms.model.Employee;
import lk.tharindu.sms.model.Project;
import lk.tharindu.sms.model.Telephone;
import lk.tharindu.sms.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	public Employee save(Employee employee) {
		
		for (Telephone telephone : employee.getTelephones()) {
			telephone.setEmployee(employee);
		}
		
		return employeeRepository.save(employee);
	}
	
	public List<Employee> fetchAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee fetchEmployee(Employee employee) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
		if (optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		}else {
			return null;
		}
	}

}
