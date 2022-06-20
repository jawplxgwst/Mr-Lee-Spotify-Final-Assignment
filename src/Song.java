/**
 * @author James Wong
 * Jun 7, 2022
 *
 * A class for Spotify
 */

public class Song {

    /* attributes */

    /** name of the song */
    private String name;

    /** genre of the song */
    private String genre;

    /* constructor */

    /**
     * Name: Song
     * Description: creates a song
     * @param name the name of the song
     * @param genre the genre of the song
     */
    public Song(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    /* accessors */

    /**
     * Name: getName
     * Description: return the name of the song
     @return the name of the songs
     */
    public String getName() {return this.name;}

    /**
     * Name: getGenre
     * Description: return the genre of the song
     @return the genre of the song
     */
    public String getGenre() {return this.genre;}


    /* other methods */

}