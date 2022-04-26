package com.example.demo.student;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity //for hibernate
@Table //for table in our database

public class Category {
    @Id
//    @SequenceGenerator(
//            name = "student_sequence",
//            sequenceName = "student_sequence",
//            allocationSize = 1
//    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
          //  generator = "student_sequence"
    )
    private long id;
    private String name;


    public Category() {
    }

    public Category(String name) {
        this.name = name;


    }







    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
