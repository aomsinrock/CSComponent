/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentjpa;

import model.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Exia
 */
public class StudentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Student std2 = new Student(2, "Marry", 45678.40);
        //     Studentable.insertStudent(std1);
//        Studentable.insertStudent(std2);
        Student std = Studentable.findStudentById(2);
        System.out.println(std);

        if (std != null) {
            std.setName("Jack");
            std.setGpa(69.29);
            // Studentable.removeStudent(std);
            Studentable.updateStudent(std);
        }
        List<Student> nameList = Studentable.findStudentByName("Marry"); //findByname
        List<Student> stdList = Studentable.findAllStudent();//find
        printAllStudent(stdList);
    }

    public static void printAllStudent(List<Student> StudentList) {
        for (Student std : StudentList) {
            System.out.print(std.getId() + " ");
            System.out.print(std.getName() + " ");
            System.out.println(std.getGpa() + " ");
        }
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentJPAPU");
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
