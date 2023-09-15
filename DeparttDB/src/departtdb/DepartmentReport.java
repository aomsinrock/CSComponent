/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departtdb;

import java.util.Collection;
import java.util.List;
import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author Exia
 */
public class DepartmentReport {

    public static void main(String[] args) {
        List<Employee> employee = EmployeeTable.findAllEmployee();
        System.out.println("All employee (by ID)\n---------------------------");
        employee.forEach(empl -> {
            System.out.println("ID: " + empl.getEmployeeid());
            System.out.println("Name: " + empl.getName());
            System.out.println("Job: " + empl.getJob());
            System.out.println("Salary: " + empl.getSalary());
            System.out.println("Department: " + empl.getDepartmentid().getName());
            System.out.println("---------------------------");

        }
        );
        List<Department> depart = DepartmentTable.findAllDepartment();
        System.out.println("All employee (by Department)\n---------------------------");
        depart.forEach(dpm1 -> {
            System.out.print("Department ID: " + dpm1.getDepartmentid());
            System.out.println(" Department Name: " + dpm1.getName() + "\n---------------------------");
            Collection<Employee> empList = dpm1.getEmployeeCollection();
            for (Employee empl : empList) {
                System.out.println("ID: " + empl.getEmployeeid());
                System.out.println("Name: " + empl.getName());
                System.out.println("Job: " + empl.getJob());
                System.out.println("Salary: " + empl.getSalary());
                System.out.println("---------------------------");
            }
        }
        );

    }
}
