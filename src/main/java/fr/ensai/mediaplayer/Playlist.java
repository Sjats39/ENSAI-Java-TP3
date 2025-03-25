package fr.ensai.mediaplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private String name;
    private List<Media> mediaList;
    private Integer totalDuration; 
    
    public Playlist(String name, List<Media> mediaList){
        this.name=name;
        this.mediaList = mediaList;
        Integer totalDuration = 0;

        for(Media media : mediaList){
            totalDuration += media.getDuration();
        }

        this.totalDuration = totalDuration;
    }

    public void addMedia(Media media){
        this.totalDuration += media.getDuration();
        mediaList.add(media);
    }

    public void removeMedia(Media media){
        if(mediaList.contains(media)){
            this.totalDuration -= media.getDuration();
            mediaList.remove(media);
        }
    }

    public void removeMedia(int index){
        if(index >= 0 &&index < mediaList.size()){
            this.totalDuration -= mediaList.remove(index).getDuration();
            
        }
    }

    public void play(boolean random) {

        List<Media> mediaListCopy = new ArrayList<>(mediaList);
    
        if (random) {
            Collections.shuffle(mediaListCopy);
        }
    
        for (Media media : mediaListCopy) {
            media.play();
        }
    }
    
    

    public Playlist copy() {

        String nameCopy = new String(name);
    
        List<Media> mediaListCopy = new ArrayList<>(mediaList);
    
        return new Playlist(nameCopy, mediaListCopy);
    }
    

    public Integer getDuration(){
        return this.totalDuration;
    }

    public Integer size(){
        return this.mediaList.size();
    }
}