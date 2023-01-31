package com.example.mymovie.DAO;

import java.util.Date;

public class ActeurDAO {

    private String nom;
    private String prenom;
    private Date datedenaissance;

    private String filmographie;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDatedenaissance() {
        return datedenaissance;
    }

    public String getFilmographie() {
        return filmographie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDatedenaissance(Date datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public void setFilmographie(String filmographie) {
        this.filmographie = filmographie;
    }
}
