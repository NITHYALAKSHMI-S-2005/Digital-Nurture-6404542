package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // HQL query using JPQL syntax
    @Query("SELECT u FROM User u WHERE u.age > ?1")
    List<User> findUsersOlderThan(int age);

    // HQL with aggregate function
    @Query("SELECT AVG(u.age) FROM User u")
    Double findAverageAge();

    // Native query
    @Query(value = "SELECT * FROM user WHERE name = ?1", nativeQuery = true)
    List<User> findByNameNative(String name);
}