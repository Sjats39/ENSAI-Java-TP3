package src.main;

public class Podcast extends Media{
    private Artist host;
    private String topic;
    private String subtitles;

    public Podcast(String title, Artist host, String topic, Integer duration, Integer year, String subtitles){
        super(title, year, duration, subtitles, host);
        this.topic = topic;
        this.host = host;
        this.subtitles = subtitles;
    }
    
}
