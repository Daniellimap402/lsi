package com.lsi.account.resource;

import com.lsi.account.domain.Account;
import com.lsi.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountResource {

    private final AccountService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Account account){
        service.save(account);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Account>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Account account){
        service.save(account);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
