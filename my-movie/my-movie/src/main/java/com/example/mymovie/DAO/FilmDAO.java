package com.example.mymovie.DAO;

import java.util.Date;

public class FilmDAO {

    private String titre;
    private String realisateur;
    private String  acteurprincipal;
    private Date datesortie;

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getActeurprincipal() {
        return acteurprincipal;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setActeurprincipal(String acteurprincipal) {
        this.acteurprincipal = acteurprincipal;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }
}
