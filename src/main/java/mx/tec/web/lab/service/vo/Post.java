/*
 * Post
 * Version 1.0
 * August 21, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.service.vo;

/**
 * Post Value Object
 * @author Enrique Sanchez
 */
public class Post {
	private String userId;
	private String id;
	private String title;
	private String body;
	
	/**
	 * No arguments constructor 
	 */
	public Post() {
	}

	/**
	 * All properties constructor
	 * @param userId The user id
	 * @param id The post id
	 * @param title The post title
	 * @param body The post body
	 */
	public Post(String userId, String id, String title, String body) {
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
}
