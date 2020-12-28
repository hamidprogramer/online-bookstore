package org.sid.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor  @ToString
public class BookCategory {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_category;
	private String categoryName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Book> books;
}
