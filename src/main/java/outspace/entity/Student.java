package outspace.entity;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @OneToOne(cascade = CascadeType.PERSIST, orphanRemoval = true)
    StudentAddress studentAddress ;

    public Student() {
    }

    public Student(String name, StudentAddress studentAddress) {
        this.name = name;
        this.studentAddress = studentAddress;

    }

}


