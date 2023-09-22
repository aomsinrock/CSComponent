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
//public class AddressTable {
//    public static void insertAddress(Address ads) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        try {
//            em.persist(ads);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//    }
//    public static void updateAddress(Address ads) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Address fromDb = em.find(Address.class, ads.getId());
//        fromDb.setId(ads.getId());
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
//    public static Address findAddressById(Integer id) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Address ads = em.find(Address.class, id);
//        em.close();
//        return ads;
//    }
//    public static List<Address> findAllAddress() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        List<Address> AddressList = (List<Address>) em.createNamedQuery("Address.findAll").getResultList();
//        em.close();
//        return AddressList;
//    }
//    public static List<Address> findAddressByName(String name) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("Address.findByName");
//        query.setParameter("name", name);
//        List<Address> AddressList = (List<Address>) query.getResultList();
//        em.close();
//        return AddressList;
//    }
//    public static void removeAddress(Address dpm) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
//        EntityManager em = emf.createEntityManager();
//        Address fromDb = em.find(Address.class, dpm.getId());
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
    

}
