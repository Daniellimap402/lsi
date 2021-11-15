package com.lsi.messaging.resource;

import com.lsi.messaging.domain.Messaging;
import com.lsi.messaging.service.MessagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messaging")
@RequiredArgsConstructor
public class MessagingResource {

    private final MessagingService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Messaging messaging){
        service.save(messaging);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Messaging>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Messaging messaging){
        service.save(messaging);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
