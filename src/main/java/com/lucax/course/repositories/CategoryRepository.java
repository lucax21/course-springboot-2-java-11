package com.lucax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucax.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
