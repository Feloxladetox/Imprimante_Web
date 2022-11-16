package com.example.appliweb.Model;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="Nom")
    private String nom;

    @Column(name="Mdp")
    private String mdp;





    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(){
        this.nom = nom;
    }

    public String getMdp(){
        return mdp;
    }

    public void setMdp(){
        this.mdp=mdp;
    }
}
