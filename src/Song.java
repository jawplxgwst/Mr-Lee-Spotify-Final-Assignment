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

    /** time of the song in second */
    private int length;

    /** album of the song */
    private String album;

    /** artist of the song */
    private String artist;

    /* constructor */

    /**
     * Name: Song
     * Description: creates a song
     * @param name the name of the song
     * @param genre the genre of the song
     * @param length the length of the song in seconds
     * @param album the album the song is from
     * @param artist the artist of the song
     */
    public Song(String name, String genre, int length, String album, String artist) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.album = album;
        this.artist = artist;
    }

    /* accessors */

    /**
     * Name: getName
     * Description: return the name of the song
     * @return the name of the songs
     */
    public String getName() {return this.name;}

    /**
     * Name: getGenre
     * Description: return the genre of the song
     * @return the genre of the song
     */
    public String getGenre() {return this.genre;}

    /**
     * Name: getLength
     * Description: return the length of the song in seconds
     * @return the time of the song in length
     */
    public int getLength() {return this.length;}

    /**
     * Name: album
     * Description: return the album of the song
     * @return the album of the song
     */
    public String getAlbum() {return this.album;}

    /**
     * Name: artist
     * Description: return the artist of the song
     * @return the artist of the song
     */
    public String getArtist() {return this.artist;}

    /* mutators */
    /**
     * Name: name
     * Description: set the name of the song
     * @param newName new possible name
     */
    public void setName(String newName) {
        if (newName.length()>0) {
            this.name = newName;
        }
    }

    /**
     * Name: genre
     * Description: set the genre of the song
     * @param newGenre new possible genre
     */
    public void setGenre(String newGenre){
        if (newGenre.length()>0) {
            this.genre = newGenre;
        }
    }

    /**
     * Name: length
     * Description: set the length of the song in seconds
     * @param newLength new possible length
     */
    public void setLength(int newLength) {
        if (newLength>0) {
            this.length = newLength;
        }
    }

    /**
     * Name: album
     * Description: set the album of the song
     * @param newAlbum new possible album
     */
    public void setAlbum(String newAlbum){
        if (newAlbum.length()>0) {
            this.album = newAlbum;
        }
    }

    /**
     * Name: artist
     * Description: set the artist of the song
     * @param newArtist new possible artist
     */
    public void setArtist(String newArtist){
        if (newArtist.length()>0) {
            this.artist = newArtist;
        }
    }

    /* other methods */

    /**
     Name: toString
     Description: returns all song attributes
     @return song attributes (time in seconds)
     */
    public String toString() {
        String attributes;

        attributes = "Name: " + this.name + "\nGenre: " + this.genre + "\nTime: " + this.length + "\nAlbum: " + this.album + "\nArtist: " + this.artist;

        return attributes;
    }
}