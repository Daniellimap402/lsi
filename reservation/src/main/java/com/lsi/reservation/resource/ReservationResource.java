package com.lsi.reservation.resource;

import com.lsi.reservation.domain.Reservation;
import com.lsi.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationResource {

    private final ReservationService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Reservation reservation){
        service.save(reservation);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Reservation>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Reservation reservation){
        service.save(reservation);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
