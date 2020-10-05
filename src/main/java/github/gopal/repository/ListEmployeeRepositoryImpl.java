package github.gopal.repository;

import github.gopal.beans.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Gopal
 */
@Component("employeeRepository")
public class ListEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("Gopal", "J");
        employees.add(employee);
        return employees;
    }

}
