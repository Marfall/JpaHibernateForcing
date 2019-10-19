import outspace.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Created by root on 19.10.19.
 */
public class Main {
    public static void main(String[] args) {
         EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();
        Student student = new Student();
        student.name = "Max";
        student.age = 27;
        student.birth = new Date();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
            em.persist(student);
        tx.commit();
    }
}
