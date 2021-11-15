package com.lsi.messaging.service;

import com.lsi.messaging.domain.Messaging;
import com.lsi.messaging.repository.MessagingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessagingService {

    private final MessagingRepository repository;

    public void save(Messaging messaging){
        this.repository.save(messaging);
    }

    public List<Messaging> getAll(){
        return this.repository.findAll();
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }
}
