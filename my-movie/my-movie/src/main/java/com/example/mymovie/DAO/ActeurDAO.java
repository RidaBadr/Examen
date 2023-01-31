package com.example.mymovie.DAO;
import java.util.Date;
import java.util.List;

public class ActeurDAO {
    private String nom;
    private String prenom;
    private Date datenaissance;
    private List<FilmDAO> filmography;

    public ActeurDAO(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = dateNaissance;
    }

    public void addFilm(FilmDAO film) {
        filmography.add(film);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return datenaissance;
    }

    public List<FilmDAO> getFilmographie() {
        return filmography;
    }
}