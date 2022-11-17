package com.example.appliweb.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT")
@Data
public class Client {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="nom")
    private String nom;

    @Column(name="mdp")
    private String mdp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
