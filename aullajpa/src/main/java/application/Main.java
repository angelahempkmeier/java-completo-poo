package application;

import dominio.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail");
        Pessoa p2 = new Pessoa(null, "Alberto", "alberto@gmail");
        Pessoa p3 = new Pessoa(null, "Camila", "camila@gmail");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Finished.");



    }
}