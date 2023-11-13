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

    public void updateEmployeeById(Integer id, Employee employee) {
        Employee foundEmployee = empList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found!!"));

        System.out.println("before updating employee details:");
        displayEmp(foundEmployee);
        Employee updatedEmployee = null;
        for (Employee emp : this.empList) {
            if (emp.getId() == id) {
                emp.setName(employee.getName());
                emp.setSalary(employee.getSalary());
                emp.getAddress().setCity(employee.getAddress().getCity());
                emp.getAddress().setState(employee.getAddress().getState());

                empList.set(id - 1, emp);
                /**
                 * or use ::-
                 * ------------
                 * for (int i = 0; i < empList.size(); i++) {
                 *             if (empList.get(i).getId().equals(id)) {
                 *                 empList.set(i, employee);
                 *                 break;
                 *             }
                 * }
                 */
                updatedEmployee = emp;
                break;
            }

        }
        System.out.println("after updating employee");
        displayEmp(updatedEmployee);
    }

    public void deleteEmployeeById(int empId) {
        Employee employee = empList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found!!"));

        empList.remove(employee);

        System.out.println("Employee with ID " + empId + " deleted successfully.");
    }
}
