package com.youssoufdiallo.publish.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name = "AUTHORITY")
public class Authority implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="authority_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long authorityId;
	
	private String authority;
	
	private String description;
	
	private Date dateCreated;
	
	 @ManyToMany(mappedBy = "privileges")
	 private Set<Role> roles = new HashSet<Role>();

	public Long getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Long authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
