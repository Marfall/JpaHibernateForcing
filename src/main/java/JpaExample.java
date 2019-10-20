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

        List<StudentAddress> listAddr = new ArrayList<StudentAddress>();  //список адресов
        List<Student>  listStud = new ArrayList<Student>();               // список студентов


        Student student  = new Student("Max");                              //создаем двух студентов
        Student student1 = new Student("Alex");

        StudentAddress studentAddress = new StudentAddress();              // создаем два адреса
        StudentAddress studentAddress1  = new StudentAddress();


        listAddr.add(studentAddress);                                      // заполняем списки
        listAddr.add(studentAddress1);

        listStud.add(student);
        listStud.add(student1);

        student.setStudentAddress(listAddr);



        entityManager.persist(student);
        entityManager.persist(student1);


        transaction.commit();

    }
}
