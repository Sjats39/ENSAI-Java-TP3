package src.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String lyrics = "\n" +
            "Catalunya triomfant,\n" +
            "tornarà a ser rica i plena.\n" +
            "Endarrere aquesta gent\n" +
            "tan ufana i tan superba.\n" +
            "\n" +
            "Bon cop de falç!\n" +
            "Bon cop de falç, Defensors de la terra!\n" +
            "Bon cop de falç!\n" +
            "\n" +
            "Ara és hora, segadors.\n" +
            "Ara és hora d'estar alerta.\n" +
            "Per quan vingui un altre juny\n" +
            "esmolem ben bé les eines.\n" +
            "\n" +
            "Bon cop de falç!\n" +
            "Bon cop de falç, Defensors de la terra!\n" +
            "Bon cop de falç!\n" +
            "\n" +
            "Que tremoli l'enemic\n" +
            "en veient la nostra ensenya.\n" +
            "Com fem caure espigues d'or,\n" +
            "quan convé seguem cadenes.\n" +
            "\n" +
            "Bon cop de falç!\n" +
            "Bon cop de falç, Defensors de la terra!\n" +
            "Bon cop de falç!\n";
        
        Artist singer = new Artist("Orfeó", "català", "Catalan");
        Artist author = new Artist("Emili", "Guanyavents", "Catalan");
        Artist composer = new Artist("Francesc", "Alió", "Catalan");
        List<String> genres = new ArrayList<>();

        genres.add(new MusicalGenres().getGenres(9)); /*Associe le 10 genre a la chanson */

        Song song = new Song("Els Segadors", singer, 1892, 104, lyrics, author, composer, genres);
        
        System.out.println(song);
        
        song.play();
    }
}
