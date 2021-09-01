/*
 * Product
 * Version 1.0
 * August 14, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.vo;

import java.util.List;

/**
 * Product Value Object to store the product attributtes
 * @author Enrique Sanchez
 * @version 1.0
 */
public class ProductVO {
	private long id;
	private String name;
	private String description;
	private List<SkuVO> childSkus;
	private List<CommentVO> comments;
	
	/**
	 * No arguments constructor
	 */
	public ProductVO() {
	}

	/**
	 * Constructor including all the properties
	 * @param id Product id
	 * @param name Product name
	 * @param description Product description
	 * @param childSkus List of Product Skus
	 * @param comments List of Comments
	 */
	public ProductVO(final long id, final String name, final String description, final List<SkuVO> childSkus, final List<CommentVO> comments) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.childSkus = childSkus;
		this.comments = comments;
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
	public void setId(final long id) {
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
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * @return the childSkus
	 */
	public List<SkuVO> getChildSkus() {
		return childSkus;
	}
	
	/**
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(final List<SkuVO> childSkus) {
		this.childSkus = childSkus;
	}

	/**
	 * @return the comments
	 */
	public List<CommentVO> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<CommentVO> comments) {
		this.comments = comments;
	}
}
