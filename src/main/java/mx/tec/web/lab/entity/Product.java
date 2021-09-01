/*
 * Product
 * Version 1.0
 * August 14, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Product Entity to store the product attributtes
 * @author Enrique Sanchez
 * @version 1.0
 */
@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1940424686731950240L;

	/** Product id */
	@Id
	@GeneratedValue
	private long id;

	/** Product name */
	private String name;
	
	/** Product description */
	private String description;
	
	/** Product child SKUs */
	@OneToMany(mappedBy = "parentProduct", cascade = CascadeType.ALL)
	private List<Sku> childSkus;
	
	/**
	 * No arguments constructor
	 */
	public Product() {
	}

	/**
	 * Constructor including all the properties
	 * @param id Product id
	 * @param name Product name
	 * @param description Product description
	 * @param childSkus List of Product Skus
	 */
	public Product(final long id, final String name, final String description, final List<Sku> childSkus) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.childSkus = childSkus;
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
	public List<Sku> getChildSkus() {
		return childSkus;
	}
	
	/**
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(final List<Sku> childSkus) {
		this.childSkus = childSkus;
	}

	/**
	 * Create a string with the Product properties
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", childSkus=" + childSkus
				+ "]";
	}
	
	/**
	 * Calculate the hashcode using the id
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/**
	 * Calculate the equality using the id
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		return this.id == other.id;
	}	
}
