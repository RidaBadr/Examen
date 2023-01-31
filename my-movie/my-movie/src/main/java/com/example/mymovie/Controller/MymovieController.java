package com.example.mymovie.Controller;
import com.example.mymovie.DAO.ActeurDAO;
import com.example.mymovie.DAO.FilmDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
@RestController

public class MymovieController {
    private List<FilmDAO> films;
    private List<ActeurDAO> acteurs;

    public MymovieController() {
        acteurs = new ArrayList<>();
        ActeurDAO acteur1 = new ActeurDAO("Badr", "RIDA", new Date());
        ActeurDAO acteur2 = new ActeurDAO("Pablo", "Emilio Escobar Gaviria", new Date());
        acteurs.add(acteur1);
        acteurs.add(acteur2);

        films = new ArrayList<>();
        FilmDAO film1 = new FilmDAO("Vis à Vis", "Johny slako", acteur1, new Date());
        FilmDAO film2 = new FilmDAO("Vikings", "Franshiska", acteur2, new Date());
        films.add(film1);
        films.add(film2);
    }
    @GetMapping("/acteurs")
    public List<ActeurDAO> getActeurs() {
        return acteurs;
    }

    @GetMapping("/acteurs/{nom}")
    public ActeurDAO getActeurByNom(@PathVariable String nom) {
        for (ActeurDAO acteur : acteurs) {
            if (acteur.getNom().equals(nom)) {
                return acteur;
            }
        }
        return null;
    }
    @GetMapping("/acteurs/film/{titre}")
    public List<ActeurDAO> getActeursByFilm(@PathVariable String titre) {
        List<ActeurDAO> acteursByFilm = new ArrayList<>();
        for (FilmDAO film : films) {
            if (film.getTitre().equals(titre)) {
                acteursByFilm.add(film.getActeurPrincipal());
                break;
            }
        }
        return acteursByFilm;
    }

    @GetMapping("/films")
    public List<FilmDAO> getFilms() {
        return films;
    }

    @GetMapping("/films/{titre}")
    public FilmDAO getFilmByTitre(@PathVariable String titre) {
        for (FilmDAO film : films) {
            if (film.getTitre().equals(titre)) {
                return film;
            }
        }
        return null;
    }



}