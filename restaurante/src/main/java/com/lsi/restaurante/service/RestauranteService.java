package com.lsi.restaurante.service;

import com.lsi.restaurante.domain.Restaurante;
import com.lsi.restaurante.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestauranteService {

    private final RestauranteRepository repository;

    public void save(Restaurante restaurante){
        this.repository.save(restaurante);
    }

    public List<Restaurante> getAll(){
        return this.repository.findAll();
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }

}
