package com.youssoufdiallo.publish.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_Id")
	private Long roleId;
	
	private String role;
	
	private String description;

	
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    
    @ManyToMany
    @JoinTable(
        name = "ROLE_AUTHORITY", 
        joinColumns = @JoinColumn(
          name = "role_Id", referencedColumnName = "role_Id"), 
        inverseJoinColumns = @JoinColumn(
          name = "authority_Id", referencedColumnName = "authority_Id"))
    private Collection<Authority> privileges;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public Collection<Authority> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Collection<Authority> privileges) {
		this.privileges = privileges;
	}

}
