package com.lucax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucax.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
