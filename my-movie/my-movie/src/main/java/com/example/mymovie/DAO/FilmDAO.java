package com.example.mymovie.DAO;

import com.example.mymovie.DAO.ActeurDAO;

import java.util.Date;

public class FilmDAO {
    private String titre;
    private String realisateur;
    private ActeurDAO acteurPrincipal;
    private Date datesortie;

    public FilmDAO(String title, String realisateur, ActeurDAO acteurPrincipal, Date datesortie) {
        this.titre = title;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.datesortie = datesortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitle(String title) {
        this.titre = title;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public ActeurDAO getActeurPrincipal() {
        return acteurPrincipal;
    }

    public void setActeurPrincipal(ActeurDAO acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }
}