package entitymanagerdemo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Address;
import model.Customer;

public class EntityManagerDemo {

    public static void main(String[] args) {
        EntityManagerDemo demo = new EntityManagerDemo();
        createData();
        demo.printAllCustomer();
        demo.printCustomerByCity("Bangkok");

    }

    public static void createData() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        Customer customer = new Customer(1L, "John", "Henry", "jh@mail.com");
        Address address = new Address(1L, "123/4 Viphavadee Rd.", "Bangkok", "10900", "TH");

        Customer customer1 = new Customer(2L, "Marry", "Jane", "mj@mail.com");
        Address address1 = new Address(2L, "123/5 Viphavadee Rd.", "Bangkok", "10900", "TH");

        Customer customer2 = new Customer(3L, "Peter", "Parker", "pp@mail.com");
        Address address2 = new Address(3L, "543/21 Fake Rd.", "Nonthaburi", "20900", "TH");

//        Customer customer = new Customer(1L, "John", "Henry", "jh@mail.com");
//        Address address = new Address(1L, "123/4 Viphavadee Rd.", "Bangkok", "10900", "TH", customer);
        customer.setAddressId(address);
        customer.setAddressId(address);
        customer1.setAddressId(address1);
        customer2.setAddressId(address2);
        address.setCustomerFk(customer);
        address1.setCustomerFk(customer1);
        address2.setCustomerFk(customer2);
//        persist(customer);
////        persist(customer1);
////        persist(customer2);
//        persist(address);
//        persist(address1);
//        persist(address2);
        em.getTransaction().begin();

        try {
            em.persist(address);
            em.persist(customer);
            em.persist(address1);
            em.persist(customer1);
            em.persist(address2);
            em.persist(customer2);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }

    public void printAllCustomer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        List<Customer> cus = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
        System.out.println("All customers\n---------------------------");
        cus.forEach(customer -> {
            System.out.print(customer.toString());
            Address address = customer.getAddressId();
            if (address != null) {
                System.out.println(address.toString());
            }
            System.out.println("---------------------------\n---------------------------");
        });
        em.close();
        emf.close();
    }

    public void printCustomerByCity(String cityName) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        // Use an ORDER BY clause to sort the results by firstname
        List<Customer> cus = em.createQuery("SELECT c FROM Customer c WHERE c.addressId.city = :city ORDER BY c.firstname", Customer.class)
                .setParameter("city", cityName)
                .getResultList();

        System.out.println("Customers in " + cityName + "\n---------------------------");
        cus.forEach(customer -> {
            System.out.print(customer.toString());
            Address address = customer.getAddressId();
            if (address != null) {
                System.out.println(address.toString());

            }
            System.out.println("---------------------------");
        });
        em.close();
        emf.close();
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
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
