package src.main;

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
        mediaList.add(media);
    }

    public void removeMedia(Media media){
        if(mediaList.contains(media)){
            mediaList.remove(media);
        }
    }

    public void removeMedia(int index){
        if(index < mediaList.size()){
            mediaList.remove(index);
        }
    }

    public void play(boolean random){

        List<Media> mediaListCopy = new ArrayList<Media>();
        Collections.copy(mediaListCopy, mediaList); /*Afin de pas perdre l'ordre pre établi, on copie la liste */

        if(random){
            Collections.shuffle(mediaListCopy);
        }

        for(Media media: mediaListCopy){
            media.play();
        }
    } 

    public Playlist copy() {
        // Create a new name copy
        String nameCopy = new String(name);
    
        // Create a new media list by copying the existing media list
        List<Media> mediaListCopy = new ArrayList<>(mediaList);  // This automatically copies all elements
    
        return new Playlist(nameCopy, mediaListCopy);
    }
    

    public Integer getDuration(){
        return this.totalDuration;
    }
}