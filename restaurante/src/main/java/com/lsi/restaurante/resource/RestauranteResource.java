package com.lsi.restaurante.resource;

import com.lsi.restaurante.domain.Restaurante;
import com.lsi.restaurante.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
@RequiredArgsConstructor
public class RestauranteResource {

    private final RestauranteService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Restaurante restaurante){
        service.save(restaurante);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Restaurante>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Restaurante restaurante){
        service.save(restaurante);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
