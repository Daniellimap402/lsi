package com.lsi.reservation.service;


import com.lsi.reservation.domain.Reservation;
import com.lsi.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository repository;

    public void save(Reservation reservation){
        this.repository.save(reservation);
    }

    public List<Reservation> getAll(){
        return this.repository.findAll();
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }
}
