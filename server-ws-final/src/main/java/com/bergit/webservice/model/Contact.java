package com.bergit.webservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CONTACTS")
public class Contact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1145883847478411653L;

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="FIRSTNAME")
	private String firstname;

	@Column(name="LASTNAME")
	private String lastname;

	@Column(name="VILLE")
	private String ville;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEPHONE")
	private String telephone;
	
	
	public String getEmail() {
		return email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
