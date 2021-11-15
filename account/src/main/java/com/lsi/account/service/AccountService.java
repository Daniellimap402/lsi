package com.lsi.account.service;

import com.lsi.account.domain.Account;
import com.lsi.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    public void save(Account account){
        this.repository.save(account);
    }

    public List<Account> getAll(){
       return this.repository.findAll();
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }
}
