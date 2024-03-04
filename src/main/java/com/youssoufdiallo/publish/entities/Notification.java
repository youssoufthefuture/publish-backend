package com.youssoufdiallo.publish.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOTIFICATION")
public class Notification implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="notification_Id")
	private Long notificationId;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_Id")
	private Product notify;
	

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publish_Id")
	private Publish publish;
	

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public Product getNotify() {
		return notify;
	}

	public void setNotify(Product notify) {
		this.notify = notify;
	}

}
