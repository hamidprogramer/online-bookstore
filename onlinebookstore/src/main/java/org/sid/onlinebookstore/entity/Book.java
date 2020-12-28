package org.sid.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor  @ToString
public class Book {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	private String description;
	
	private String imageUrl;
	private BigDecimal unitPrice;
	private boolean active;
	private int unitsInStock;
	private Date creationOn;
	private Date updateOn;
	@ManyToOne
	@JoinColumn(name="id_category")
	private BookCategory category;
}
