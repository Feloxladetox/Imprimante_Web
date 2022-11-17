package com.example.appliweb.Service;

import com.example.appliweb.Model.Client;
import com.example.appliweb.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ClientService implements ClientServiceInterface {

    @Autowired
    private final ClientRepository clientrepository;


    @Override
    public Client creer(Client client) {
        return clientrepository.save(client);
    }

    @Override
    public List<Client> lire() {
        return (List<Client>) clientrepository.findAll();
    }

    @Override
    public Client modifier(long id, Client client) {
        return clientrepository.findById(id)
                .map(p->{
                    p.setId(client.getId());
                    p.setNom(client.getNom());
                    p.setMdp(client.getMdp());
                    return clientrepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }

    @Override
    public String supprimer(long id) {
        clientrepository.deleteById(id);
        return "client supprimé";
    }
}

