package outspace.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 20.10.19.
 */
@Entity
public class StudentAddress  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String city;
    String street;

    public StudentAddress() {
        city = "myCity";
        street = "myStreet";
    }


}