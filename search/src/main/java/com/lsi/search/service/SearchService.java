package com.lsi.search.service;

import com.lsi.search.domain.Search;
import com.lsi.search.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final SearchRepository repository;

    public void save(Search search){
        this.repository.save(search);
    }

    public List<Search> getAll(){
        return this.repository.findAll();
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }
}
