package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userRepository.save(new User() {{ setId(1L); setName("Alice"); setAge(30); }});
        userRepository.save(new User() {{ setId(2L); setName("Bob"); setAge(25); }});

        List<User> users = userRepository.findUsersOlderThan(20);
        users.forEach(u -> System.out.println("HQL: " + u.getName()));

        Double avg = userRepository.findAverageAge();
        System.out.println("Average Age: " + avg);

        List<User> nativeUsers = userRepository.findByNameNative("Alice");
        nativeUsers.forEach(u -> System.out.println("Native Query: " + u.getName()));
    }
}