package com.example.appliweb.Controller;

import com.example.appliweb.Model.Client;
import com.example.appliweb.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppliWebcontroller {

    @Autowired
    private ClientService clientService;

    //@RequestMapping ("/bonjour")
    //public String hello()
    //{
    //    return "hello world";
    //}
    @GetMapping("/client")
    public Iterable<Client> getClient(){
        return clientService.getClient();
    }
}
