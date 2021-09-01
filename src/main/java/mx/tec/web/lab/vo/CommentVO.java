/*
 * CommentVO
 * Version 1.0
 * August 21, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.vo;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author Enrique Sanchez
 */
public class CommentVO {
	private long id;
	private String author;
	private String body;
    @JsonFormat(pattern="yyyy-M-dd",timezone = "GMT-6")
	private Calendar created;
	
	/**
	 * No arguments constructor
	 */
	public CommentVO() {
	}

	/**
     * All properties constructor
	 * @param id The comment id
	 * @param author The comment author
	 * @param body The comment body
	 * @param created The comment date of creation
	 */
	public CommentVO(long id, String author, String body, Calendar created) {
		this.id = id;
		this.author = author;
		this.body = body;
		this.created = created;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
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

	/**
	 * @return the created
	 */
	public Calendar getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Calendar created) {
		this.created = created;
	}
}
