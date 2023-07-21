package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariem = new Student(
                    "mariem",
                    LocalDate.of(2000, Month.APRIL, 4),
                    "mariem@gmail.com"


            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2000, Month.APRIL, 4),
                    "alex@gmail.com"
            );

            repository.saveAll(List.of(mariem, alex));
        };
    }
}
