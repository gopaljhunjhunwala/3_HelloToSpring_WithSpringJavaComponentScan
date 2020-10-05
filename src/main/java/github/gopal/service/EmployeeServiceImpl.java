package github.gopal.service;

import github.gopal.beans.Employee;
import github.gopal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Gopal
 */
@Component(EmployeeService.COMPONENT_NAME)
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override public List<Employee> getAllEmployees() {
        return repository.getAllEmployees();
    }

}
