/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Exia
 */
public class EmployeeTable {
       public static void insertEmployee(Employee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(emp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static void updateEmployee(Employee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Employee fromDb = em.find(Employee.class, emp.getEmployeeid());
        fromDb.setName(emp.getName());
        fromDb.setSalary(emp.getSalary());
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static Employee findEmployeeById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.close();
        return emp;
        //    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentJPAPU");
//        EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("Student.findById");
//        query.setParameter("id", id);
//        List<Student> StudentList = (List<Student>) query.getResultList();
//        em.close();
//        return StudentList;
    }
    public static List<Employee> findAllEmployee() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        List<Employee> EmployeetList = (List<Employee>) em.createNamedQuery("Employee.findAll").getResultList();
        em.close();
        return EmployeetList;
    }
    public static List<Employee> findemployeeByName(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findByName");
        query.setParameter("name", name);
        List<Employee> EmployeetList = (List<Employee>) query.getResultList();
        em.close();
        return EmployeetList;
    }
    public static void removeEmployee(Employee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Employee fromDb = em.find(Employee.class, emp.getEmployeeid());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                
    }
    

    

}
