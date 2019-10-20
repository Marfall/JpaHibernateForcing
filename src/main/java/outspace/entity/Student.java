package outspace.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "universityStudent")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stud_addr", joinColumns = @JoinColumn(name = "studId"), inverseJoinColumns = @JoinColumn(name = "addr_id"))
    List<StudentAddress> studentAddress = new ArrayList<StudentAddress>();
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public List<StudentAddress> getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(List<StudentAddress> studentAddress) {
        this.studentAddress = studentAddress;
    }
}

