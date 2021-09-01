/*
 * ProductDAO
 * Version 1.0
 * August 21, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.dao;

import java.util.List;
import java.util.Optional;

import mx.tec.web.lab.vo.ProductVO;

/**
 * Product Data Access Object
 * @author Enrique Sanchez
 */
public interface ProductDAO {
	/**
	 * Find all the products
	 * @return List of products or an empty list if no products where found
	 */
	List<ProductVO> findAll();

	/**
	 * Find a product by the id
	 * @param id Product id
	 * @return An Optional containing the found Product or an empty Optional otherwise
	 */
	Optional<ProductVO> findById(long id);
	
	/**
	 * Find all the products matching the pattern in the name property
	 * @param pattern Pattern to search
	 * @return List of products or an empty list if no products where found
	 */
	List<ProductVO> findByNameLike(String pattern);
	
	/**
	 * Persist a new product
	 * @param newProduct Product to add
	 * @return The persisted Product
	 */
	ProductVO insert(ProductVO newProduct);
	
	/**
	 * Remove a Product
	 * @param existingProduct The Product to remove
	 */
	void remove(ProductVO existingProduct);

	/**
	 * Update an existing Product
	 * @param existingProduct The product to update
	 */
	void update(ProductVO existingProduct);
}
