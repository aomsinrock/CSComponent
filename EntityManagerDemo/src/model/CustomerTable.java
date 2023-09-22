///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
///**
// *
// * @author Exia
// */
//public class CustomerTable {
//    public static void insertCustomer(Customer cus) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        try {
//            em.persist(cus);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//    }
//    public static void updateCustomer(Customer cus) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Address fromDb = em.find(Address.class, cus.getId());
//        fromDb.setId(cus.getId());
//        em.getTransaction().begin();
//        try {
//            em.persist(fromDb);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//    }
//    public static Customer findCustomerById(Integer id) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Customer cus = em.find(Customer.class, id);
//        em.close();
//        return cus;
//        //    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentJPAPU");
////        EntityManager em = emf.createEntityManager();
////        Query query = em.createNamedQuery("Student.findById");
////        query.setParameter("id", id);
////        List<Student> StudentList = (List<Student>) query.getResultList();
////        em.close();
////        return StudentList;
//    }
//    public static List<Customer> findAllCustomer() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        List<Customer> CustomerList = (List<Customer>) em.createNamedQuery("Customer.findAll").getResultList();
//        em.close();
//        return CustomerList;
//    }
//    public static List<Customer> findCustomerByName(String name) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("Student.findByName");
//        query.setParameter("name", name);
//        List<Customer> CustomerList = (List<Customer>) query.getResultList();
//        em.close();
//        return CustomerList;
//    }
//    public static void removeCustomer(Customer dpm) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Customer fromDb = em.find(Customer.class, dpm.getId());
//        em.getTransaction().begin();
//        try {
//            em.remove(fromDb);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//                
//    }
//    
//
//}
