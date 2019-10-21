import outspace.entity.Student;
import outspace.entity.StudentAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class JpaExample {
    public static void main(String[] args) {
        EntityManagerFactory jpaUnit  =
                Persistence.createEntityManagerFactory("JpaUnit");

        EntityManager entityManager = jpaUnit.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        StudentAddress studentAddress = new StudentAddress();
        Student max = new Student("Max", studentAddress);
        entityManager.persist(max);
        transaction.commit();

        entityManager.getTransaction().begin();
        entityManager.remove(max);
        entityManager.getTransaction().commit();

    }
}
