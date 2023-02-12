package com.aleksei.booklibrary.repositories;

import com.aleksei.booklibrary.models.Book;
import com.aleksei.booklibrary.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer>, JpaSpecificationExecutor<Book> {
    List<Book> findByTitleStartingWith(String title);
}
