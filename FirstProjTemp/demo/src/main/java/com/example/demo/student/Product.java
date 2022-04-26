package com.example.demo.student;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {

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


    public Product() {
    }

    public Product(long id, String name, String email) {
        this.id = id;
        this.name = name;


    }

    public Product(String name, String email) {
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
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
