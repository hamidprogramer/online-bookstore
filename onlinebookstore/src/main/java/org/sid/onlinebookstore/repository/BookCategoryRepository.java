package org.sid.onlinebookstore.repository;

import org.sid.onlinebookstore.entity.Book;
import org.sid.onlinebookstore.entity.BookCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{

	
}