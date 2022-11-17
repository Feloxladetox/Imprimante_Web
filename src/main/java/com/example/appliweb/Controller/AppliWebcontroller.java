package com.example.appliweb.Controller;

import com.example.appliweb.Model.Client;
import com.example.appliweb.Service.ClientServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/connexion")
@AllArgsConstructor
public class AppliWebcontroller {

    @Autowired
    private final ClientServiceInterface clientServiceInterface;




    @PostMapping("/create")
    public Client create(@RequestBody Client client){
        return clientServiceInterface.creer(client);
    }

    @GetMapping("/read")
    public List<Client> read(){
        return clientServiceInterface.lire();
    }

    @PutMapping("/update/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client){
        return clientServiceInterface.modifier(id, client);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable long id){
        return clientServiceInterface.supprimer(id);
    }



//@RequestMapping ("/bonjour")
    //public String hello()
    //{
    //    return "hello world";
    //}


    /*@PostMapping("/Index")

    public Iterable<Client> getClient(){
        return clientService.getClient();
    }*/



}
