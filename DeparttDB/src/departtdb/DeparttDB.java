/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departtdb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Department;
import model.Employee;

/**
 *
 * @author Exia
 */
public class DeparttDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department dpm1 = new Department();
        Department dpm2 = new Department();
        dpm1.setName("IT");
        dpm2.setName("HR");
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        emp1.setEmployeeid(1);
        emp1.setName("John");
        emp1.setJob("HR Manager");
        emp1.setSalary(56789.0);
        emp1.setDepartmentid(dpm1);
        //
        emp2.setEmployeeid(2);
        emp2.setName("Marry");
        emp2.setJob("Network Admin");
        emp2.setSalary(46789.0);
        emp2.setDepartmentid(dpm2);
        //
        emp3.setEmployeeid(3);
        emp3.setName("Kheerinthon");
        emp3.setJob("Programer");
        emp3.setSalary(67890.0);
        emp3.setDepartmentid(dpm1);
        //
        emp4.setEmployeeid(4);
        emp4.setName("Kiana");
        emp4.setJob("HR Recruiter");
        emp4.setSalary(10000.0);
        emp4.setDepartmentid(dpm2);
        
        persist(dpm1);
        persist(dpm2);
        persist(emp1);
        persist(emp2);
        persist(emp3);
        persist(emp4);
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
