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
public class DepartmentTable {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Exia
 */
        public static void insertDepartment(Department dpm) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(dpm);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static void updateDepartment(Department dpm) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Employee fromDb = em.find(Employee.class, dpm.getDepartmentid());
        fromDb.setName(dpm.getName());
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
    public static Department findDepartmentById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Department dpm = em.find(Department.class, id);
        em.close();
        return dpm;
        //    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentJPAPU");
//        EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("Student.findById");
//        query.setParameter("id", id);
//        List<Student> StudentList = (List<Student>) query.getResultList();
//        em.close();
//        return StudentList;
    }
    public static List<Department> findAllDepartment() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        List<Department> DepartmentList = (List<Department>) em.createNamedQuery("Department.findAll").getResultList();
        em.close();
        return DepartmentList;
    }
    public static List<Department> findDepartmentByName(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findByName");
        query.setParameter("name", name);
        List<Department> DepartmentList = (List<Department>) query.getResultList();
        em.close();
        return DepartmentList;
    }
    public static void removeDepartment(Department dpm) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeparttDBPU");
        EntityManager em = emf.createEntityManager();
        Department fromDb = em.find(Department.class, dpm.getDepartmentid());
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

