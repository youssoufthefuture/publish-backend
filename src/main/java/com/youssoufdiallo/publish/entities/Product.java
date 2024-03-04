package com.youssoufdiallo.publish.entities;

import java.io.Serializable;
import java.util.Collection;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_Id")
	private Long productId;
	
	@Column(length=40)
	private String designation ;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_Id")
    private Category category;
    
	@OneToMany(mappedBy="notify",fetch=FetchType.LAZY)
    private Collection<Notification> notifications;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long id) {
		this.productId = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Collection<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(Collection<Notification> notifications) {
		this.notifications = notifications;
	}
}
