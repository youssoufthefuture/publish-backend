package com.youssoufdiallo.publish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youssoufdiallo.publish.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
