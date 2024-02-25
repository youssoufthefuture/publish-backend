package com.youssoufdiallo.publish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youssoufdiallo.publish.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
