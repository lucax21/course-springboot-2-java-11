package com.lucax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucax.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
