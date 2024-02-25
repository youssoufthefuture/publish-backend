package com.youssoufdiallo.publish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youssoufdiallo.publish.entities.Publish;

public interface PublishRepository extends JpaRepository<Publish, Long>{

}
