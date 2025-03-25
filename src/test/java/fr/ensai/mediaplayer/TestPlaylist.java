package fr.ensai.mediaplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import fr.ensai.mediaplayer.Playlist;

class TestPlaylist {

    public static Song song1(){
        /* text transform : https://www.snible.org/java2/uni2java.html */
        String lyrics = "\n\nCatalunya triomfant,\ntornar\u00E0 a ser rica i plena.\nEndarrere aquesta gent\ntan ufana i tan superba.\n\nBon cop de fal\u00E7!\nBon cop de fal\u00E7, Defensors de la terra!\nBon cop de fal\u00E7!\n\nAra \u00E9s hora, segadors.\nAra \u00E9s hora d'estar alerta.\nPer quan vingui un altre juny\nesmolem ben b\u00E9 les eines.\n\nBon cop de fal\u00E7!\nBon cop de fal\u00E7, Defensors de la terra!\nBon cop de fal\u00E7!\n\nQue tremoli l'enemic\nen veient la nostra ensenya.\nCom fem caure espigues d'or,\nquan conv\u00E9 seguem cadenes.\n\nBon cop de fal\u00E7!\nBon cop de fal\u00E7, Defensors de la terra!\nBon cop de fal\u00E7!\n";
        
        Artist singer = new Artist("Orfeó", "català", "Catalan");
        Artist author = new Artist("Emili", "Guanyavents", "Catalan");
        Artist composer = new Artist("Francesc", "Alió", "Catalan");
        List<String> genres = new ArrayList<>();

        genres.add(new MusicalGenres().getGenres(9)); /*Associe le 10 genre a la chanson */

        Song song = new Song("Els Segadors", singer, 1892, 104, lyrics, author, composer, genres);
        
        return song; 

    }

    public static Song song2(){
        String lyrics = "\"Amb un palillo ala boca i el bra\u00E7 fora la finestra\n        Baya baye re que veure amb la resta\n        Sacs de pinso i eines a dins la furgoneta\n        Eh, em ric del vostre treatre de gengstas\n        Aix\u00F2 \u00E9s pel poble no x altes esferes\n        On conviuen els tigres amb les rates de clavaguera\n        Conec el tro\u00E7 i tamb\u00E9 conec les voreres\n        Se lo que es el mal deskena i cuidarme leskenas\n        Vigila lo que muestras i capta les senyals\n        Que la vida \u00E9s perra (puerca) i acostuma a ferte mal\n        M\u00E9s disciplina m\u00E9s suor i menys mam\n        Aprenc dels pals que ram\u00F3n pa eso stan estan\n        Odian al catalan, odian a limigrant\n        Pero no a puyol no a lamine yamal\n        (Pero pal seguen mundial amAn a lamine yamal)\n        Cuanta hipocresia puta colla subnormals\n        Cagundeu suprimo cambia de canal\n        Eyo Surto pel carrer i la penya sem queda miran\n        Seran fans ? mestan retan ?\n        Sera que pasejo amb un parell de dobermans\n        K es caguen al devant d la policia local\n        Eyo soci bona nit, buenas noches good night\n        Baja los fums prim que no eres Shuge knight\n        Avui es el tik tok lo que als 80 el caball\n        Si muerdes el anzuelo sosi baixes cap avall\n        Que si dic bujarra, qui si dic tolai\n        Volen que parli con un monitor desplai\n        Abans de jutjarnos mirat al mirall\n        Que venim d'entorns molt diferents company\n        Ai, como me pide n que no critique\n        si solo le dan valor al puto precio de las nike\n        Del Deja de jincar vaya a ser que te pique\n        Al Deja de volcar primo vaya palique\n        A x totes pibe, no contemplo un plan b\n        Akests porcs no valen ni x fer Pat\u00E9\n        Torno per la nacional vinc d comprar planter\n        I truco al meu sosi per veure quin plan t\u00E9\n        Perke em cambia el chip si me bebo tres\n        Y si em bec el doble pues ja no mimporta re\n        Vull comprarme una masia no un chal\u00E9\n        Centrarme la vida y allunyarme del carrer\n        Uh! eh! Destraler!\n        Preparaos para la guerra perke mai saps lo ke ve\n        Uh eh, barraler\n        Como ens cuesta sosi portarnos b\u00E9\n        Uh! eh! Destraler!\n        Preparaos para la guerra perke mai saps lo ke ve\n        Uh eh, barraler\n        Como ens cuesta sosi portarnos b\u00E9\"";
        
        Artist singer = new Artist("Baya", "Baye", "Catalan");
        Artist author = new Artist("Victor", "Ballesteros", "Catalan");
        Artist composer = new Artist("Victor", "Ballesteros", "Catalan");
        List<String> genres = new ArrayList<>();

        genres.add(new MusicalGenres().getGenres(3));
        genres.add(new MusicalGenres().getGenres(6));
        Song song = new Song("Destraler", singer, 2025, 180, lyrics, author, composer, genres);
        
        return song; 
    }
    
    public static Podcast podcast1(){

        Artist host = new Artist("Andreu", "Juanola", "Catalan");
        String topic = "Football";
        String subtitles = "Hola, hola! Benvinguts a La Sotana, un programa d'esports, \u00E9s a dir, de futbol, \u00E9s a dir, de Messi... perqu\u00E8, clar, tot gira al voltant de Messi, no? Som aqu\u00ED per parlar de tot el que passa al m\u00F3n del futbol, per\u00F2 si podem fer-ho amb m\u00E9s sarcasme que un comentarista esportiu de la tele, millor! Avui, com sempre, estem preparats per destrossar-ho tot, aix\u00ED que agafeu-vos b\u00E9 que arrenca l'an\u00E0lisi m\u00E9s profund i objectiu sobre el que ha passat a la jornada.";
        String title = "La Sotana ";
        Integer duration = 75;
        Integer year = 2025;

        return new Podcast(title, host, topic, duration, year, subtitles);
    }

    @Test
    void Playlist_removeMedia_not_found_by_media() {
        // GIVEN
        Song destraler = song2();
        Podcast sotana = podcast1();

        List<Media> mediaList = new ArrayList<Media>();

        mediaList.add(destraler);
        // WHEN
        mediaList.remove(sotana);

        // THEN
        assertEquals(mediaList.size(), 1);
    }

    @Test
    void Playlist_removeMedia_media_found_by_index() {
        // GIVEN
        Song destraler = song2();

        List<Media> mediaList = new ArrayList<Media>();

        mediaList.add(destraler);
        // WHEN
        mediaList.remove(0);

        // THEN
        assertEquals(mediaList.size(), 0);
    }

    @Test
    void Playlist_removeMedia_media_found_by_media() {
        // GIVEN
        Song destraler = song2();

        List<Media> mediaList = new ArrayList<Media>();

        mediaList.add(destraler);
        // WHEN
        mediaList.remove(destraler);

        // THEN
        assertEquals(mediaList.size(), 0);
    }

    @Test
    void Playlist_addMedia() {
        // GIVEN
        Song destraler = song2();

        List<Media> mediaList = new ArrayList<Media>();

        
        // WHEN
        mediaList.add(destraler);

        // THEN
        assertEquals(mediaList.size(), 1);
    }

}