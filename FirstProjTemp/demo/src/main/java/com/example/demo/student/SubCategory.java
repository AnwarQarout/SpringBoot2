package com.example.demo.student;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SubCategory {

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


    public SubCategory() {
    }

    public SubCategory(long id, String name, String email) {
        this.id = id;
        this.name = name;


    }

    public SubCategory(String name, String email) {
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
