package src.main;

import java.util.ArrayList;
import java.util.List;

public class MusicalGenres {
    private List<String> genres;

    public MusicalGenres() {
        genres = new ArrayList<>();
        init();
    }

    public void init() {
        genres.add("Pop");
        genres.add("Rock");
        genres.add("Electro");
        genres.add("Rap");
        genres.add("Classical");
        genres.add("Hip-Hop");
        genres.add("Macarrisme");
        genres.add("Folk");
        genres.add("Indie");
        genres.add("Traditional");
    }

    public void addGenre(String genre) {
        genres.add(genre);
    }

    public void enteredGenres() {
        System.out.println(genres);
    }

    public String getGenres(Integer index){
        return genres.get(index);
    }

    public void deleteGenre(String genre) {
        if (genres.contains(genre)) {
            genres.remove(genre);
        }
    }
    
}
