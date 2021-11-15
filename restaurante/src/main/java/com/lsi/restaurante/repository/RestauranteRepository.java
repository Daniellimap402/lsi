package com.lsi.restaurante.repository;

import com.lsi.restaurante.domain.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
