package fr.ensai.mediaplayer;

public class Media {
    private String title;
    private int year;
    private int duration;
    private String text; /* Peut être sous-titres ou lyrics */
    private Artist protagonist; /*either host or singer */

    public Media(String title, int year, int duration, String text, Artist protagonist) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.text = text;
        this.protagonist = protagonist;
    }

    public void play() {

        String[] listeMots = text.split(" ");
        for (String mot : listeMots) {
            System.out.print(mot + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.print("Chanson interrompue.");
            }
        }
    }
    

    @Override
    public String toString() {
        return "Song " + this.title + " by " + this.protagonist.toString();
    }

    public Integer getYear(){
        return this.year;
    }

    public String getTitle(){
        return this.title;
    }

    public Integer getDuration(){
        return this.duration;
    }
}
