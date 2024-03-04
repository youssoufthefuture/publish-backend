package com.youssoufdiallo.publish.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS")
public class User implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_Id")
	private Long userId;

	private String firstName;
	private String lastName;
	//@Email
	private String email;
	private String password;
	private String username;
	private String phone;

	private boolean enabled;
	private boolean tokenExpired;



	@ManyToMany 
	@JoinTable( 
			name = "USER_ROLE", 
			joinColumns = @JoinColumn(
					name = "user_Id", referencedColumnName = "user_Id"), 
			inverseJoinColumns = @JoinColumn(
					name = "role_Id", referencedColumnName = "role_Id")) 

	private List<Role> roles = new ArrayList<Role>();

	@OneToMany(mappedBy = "user")
	private List<Publish> publishes = new ArrayList<Publish>();



	public Long getUserId() {
		return userId;
	}


	public List<Publish> getPublishes() {
		return publishes;
	}


	public void setPublishes(List<Publish> publishes) {
		this.publishes = publishes;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public boolean isTokenExpired() {
		return tokenExpired;
	}


	public void setTokenExpired(boolean tokenExpired) {
		this.tokenExpired = tokenExpired;
	}

	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
