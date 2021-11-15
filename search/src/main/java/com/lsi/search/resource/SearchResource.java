package com.lsi.search.resource;

import com.lsi.search.domain.Search;
import com.lsi.search.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchResource {

    private final SearchService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Search search){
        service.save(search);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Search>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Search search){
        service.save(search);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
