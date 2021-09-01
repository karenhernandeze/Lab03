/*
 * User
 * Version 1.0
 * August 21, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.service.vo;

/**
 * User Value Object
 * @author Enrique Sanchez
 */
public class User {
	String id;
	String name;
	String username;
	String email;
	String phone;
	String website;

	/**
	 * No arguments constructor
	 */
	public User() {
	}

	
	
	/**
	 * All properties constructor
	 * @param id The user id
	 * @param name The user name
	 * @param username The user username
	 * @param email The user email
	 * @param phone The user phone
	 * @param website The user website
	 */
	public User(String id, String name, String username, String email, String phone, String website) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.website = website;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

}
