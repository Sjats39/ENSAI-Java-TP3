package src.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private String name;
    private List<Media> mediaList;
    private Integer totalDuration; 
    
    public Playlist(String name, List<Media> mediaList, Integer totalDuration){
        this.name=name;
        this.mediaList = mediaList;
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

    
}