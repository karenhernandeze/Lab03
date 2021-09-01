/*
 * ProductMapper
 * Version 1.0
 * August 21, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import mx.tec.web.lab.entity.Product;
import mx.tec.web.lab.entity.Sku;
import mx.tec.web.lab.service.CommentsService;
import mx.tec.web.lab.vo.ProductVO;

/**
 * Mapper for Product Objetcs 
 * @author Enrique Sanchez
 */
@Component
public class ProductMapper {
	/**
	 * Reference to the Model Mapper
	 */
	@Resource
    private ModelMapper modelMapper;
	
	@Resource
	CommentsService commentService;

	/**
	 * Convert from Product Entity to Product Value Object
	 * @param product Product Entity to convert
	 * @return Product Value Object conversion
	 */
	public ProductVO convertToVO(final Product product) {
		ProductVO productVO = modelMapper.map(product, ProductVO.class);
		productVO.setComments(commentService.getComments());
		return productVO;
	}	

	/**
	 * Convert from Product Value Object to Product Entity
	 * @param productVO Product Value to convert
	 * @return Product Entity conversion
	 */
	public Product convertToEntity(final ProductVO productVO) {
		Product product = modelMapper.map(productVO, Product.class);
		
		for (final Sku sku : product.getChildSkus()) {
			sku.setParentProduct(product);
		}		
		
		return product;
	}	
	
	/**
	 * Convert from Optional Product Entity to Optional Product Value Object
	 * @param product Product Entity Optional to convert
	 * @return Optional Product Value Object conversion
	 */
	public Optional<ProductVO> convertToOptionalVO(final Optional<Product> product) {
		Optional<ProductVO> productVO = Optional.empty();
		
		if (product.isPresent()) {
			productVO = Optional.of(convertToVO(product.get()));
		}

	    return productVO;
	}
	
	/**
	 * Convert from Product Entity List to Product Value Object List
	 * @param products Product Entity List to convert
	 * @return Product Value Object List conversion
	 */
	public List<ProductVO> convertToVOList(final List<Product> products) {
		final List<ProductVO> productVOs = new ArrayList<>();
		
		for (final Product product : products) {
			productVOs.add(convertToVO(product));
	    }

		return productVOs;
	}
}
