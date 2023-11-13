package com.madeeasy.week5.junit.service;

import com.madeeasy.week5.junit.exception.EmployeeNotFoundException;
import com.madeeasy.week5.junit.model.Address;
import com.madeeasy.week5.junit.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    static int id = 1;
    private List<Employee> empList = new ArrayList<>();

    //method to save Employee details
    public void saveEmployee(String empName, double salary,
                             String city, String state) {
        Address add = new Address(id, city, state);
        empList.add(new Employee(id, empName, salary, add));
        id++;
    }

    //method to add employee details
    public void addEmployee(Employee emp) {
        empList.add(emp);
    }

    //method to return the size of the list
    public int sizeOfList() {
        return empList.size();
    }

    //method to display employee details
    public void displayEmp(Employee emp) {
        System.out.println("Emp Id: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("City: " + emp.getAddress().getCity());
        System.out.println("State: " + emp.getAddress().getState());
    }

    //method to fetch employee details using id
    public Employee getEmpById(int empId) {
        Employee employee = empList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found!!"));

        displayEmp(employee);

        return employee;
    }

    // update by id method
    public void updateEmployeeById(Integer id, Employee employee) {
        Employee foundEmployee = empList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found!!"));

        foundEmployee.setName(employee.getName());
        foundEmployee.setSalary(employee.getSalary());
        foundEmployee.getAddress().setCity(employee.getAddress().getCity());
        foundEmployee.getAddress().setState(employee.getAddress().getState());

        System.out.println("Employee details updated successfully:");
        displayEmp(foundEmployee);
    }

    // delete by id method
    public void deleteEmployeeById(int empId) {
        Employee employee = empList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found!!"));

        empList.remove(employee);

        System.out.println("Employee with ID " + empId + " deleted successfully.");
    }
}
