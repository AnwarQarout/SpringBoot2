package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {

           Student anwar =  new Student("Anwar","anwarqarout@gmail.com", LocalDate.of(2000, Month.MARCH,5));
           Student abd =  new Student("Abd","abd@gmail.com", LocalDate.of(1995, Month.MARCH,5));

            repository.save(anwar);
            repository.save(abd);
        };
    }
}
