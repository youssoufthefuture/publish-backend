package com.youssoufdiallo.publish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youssoufdiallo.publish.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
