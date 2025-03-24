package src.main;

import java.util.List;
import java.util.Objects;

/**
 * Represents a song with essential attributes.
 */
public class Song extends Media{
    private Artist singer;
    private Artist author;
    private String lyrics; /* see if usefull afterwards */
    private Artist composer;
    private List<String> genres; 

    /**
     * Constructs a new Song object.
     *
     * @param singer   The singer of the song.
     * @param lyrics   The lyrics of the song.
     * @param author   The author of the song.
     * @param composer The composer of the song.
     */
    public Song(String title, Artist singer, int year, int duration, String lyrics, Artist author, Artist composer, List<String> genres) {
        super(title, year, duration, lyrics, singer);
        this.singer = singer;
        this.lyrics = lyrics;
        this.author = author;
        this.composer = composer;
        this.genres = genres;
    }

    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.getYear() == otherSong.getYear() &&
                Objects.equals(this.getTitle(), otherSong.getTitle()) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.singer, this.getYear());
    }

    

}