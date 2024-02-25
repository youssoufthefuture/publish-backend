package com.youssoufdiallo.publish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youssoufdiallo.publish.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
