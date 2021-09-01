/*
 * Sku
 * Version 2.0
 * August 14, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.vo;

/**
 * Sku Value Object to store the SKU attributtes
 * @author Enrique Sanchez
 * @version 2.0
 */
public class SkuVO {
	private long id;
	private String color;
	private String size;
	private double listPrice;
	private double salePrice;
	private long quantityOnHand;
	private String smallImageUrl;
	private String mediumImageUrl;
	private String largeImageUrl;

	/**
	 * No arguments constructor
	 */
	public SkuVO() {
	}

	/**
	 * Constructor including all the properties
	 * @since 2.0
	 * @param id Sku id
	 * @param color Sku color
	 * @param size Sku size
	 * @param listPrice The list price
	 * @param salePrice The sale price
	 * @param quantityOnHand The quantity on hand
	 * @param smallImageUrl The small Image URL
	 * @param mediumImageUrl The medium Image URL
	 * @param largeImageUrl The large Image URL
	 */
	public SkuVO(long id, String color, String size, double listPrice, double salePrice, long quantityOnHand,
			String smallImageUrl, String mediumImageUrl, String largeImageUrl) {
		this.id = id;
		this.color = color;
		this.size = size;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.quantityOnHand = quantityOnHand;
		this.smallImageUrl = smallImageUrl;
		this.mediumImageUrl = mediumImageUrl;
		this.largeImageUrl = largeImageUrl;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}

	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @return the quantityOnHand
	 */
	public long getQuantityOnHand() {
		return quantityOnHand;
	}

	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	/**
	 * @return the smallImageUrl
	 */
	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	/**
	 * @param smallImageUrl the smallImageUrl to set
	 */
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}

	/**
	 * @return the mediumImageUrl
	 */
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}

	/**
	 * @param mediumImageUrl the mediumImageUrl to set
	 */
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}

	/**
	 * @return the largeImageUrl
	 */
	public String getLargeImageUrl() {
		return largeImageUrl;
	}

	/**
	 * @param largeImageUrl the largeImageUrl to set
	 */
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}
}
