package com.example.appliweb.Service;

import com.example.appliweb.Model.Client;
import com.example.appliweb.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientrepository;

    public Iterable<Client> getClient(){
        return clientrepository.findAll();
    }
}
