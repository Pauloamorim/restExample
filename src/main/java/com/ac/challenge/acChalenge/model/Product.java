package com.ac.challenge.acChalenge.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduct;
	
	@OneToMany(mappedBy="product")
	private List<Image> image;
	
	@ManyToOne
	private Product product;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
	
}
