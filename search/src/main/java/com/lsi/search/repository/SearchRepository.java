package com.lsi.search.repository;

import com.lsi.search.domain.Search;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<Search, Long> {
}
