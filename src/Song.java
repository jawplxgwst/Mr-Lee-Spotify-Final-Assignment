
/**
 * @author James Wong
 * Jun 7, 2022
 *
 * A class for Spotify
 */

// Imported Packages
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Scanner;

public class Song {

    /* attributes */

    /** name of the song */
    private String name;

    /** genre of the song */
    private String genre;

    /** time of the song in second */
    private Integer length;

    /** album of the song */
    private String album;

    /** artist of the song */
    private String artist;

    /** mp3 of the song */
    private String mp3File;

    /* constructor */

    /**
     * Name: Song
     * Description: creates a song
     * @param name the name of the song
     * @param genre the genre of the song
     * @param length the length of the song in seconds
     * @param album the album the song is from
     * @param artist the artist of the song
     * @param mp3File the mp3 of the song
     */
    public Song(String name, String genre, Integer length, String album, String artist, String mp3File) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.album = album;
        this.artist = artist;
        this.mp3File = mp3File;
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
    public Integer getLength() {return this.length;}

    /**
     * Name: getAlbum
     * Description: return the album of the song
     * @return the album of the song
     */
    public String getAlbum() {return this.album;}

    /**
     * Name: getArtist
     * Description: return the artist of the song
     * @return the artist of the song
     */
    public String getArtist() {return this.artist;}

    /**
     * Name: getMp3File
     * Description: return the mp3 file of the song
     * @return the mp3File of the song
     */
    public String getMp3File() {return this.mp3File;}

    /* mutators */
    /**
     * Name: setName
     * Description: set the name of the song
     * @param newName new possible name
     */
    public void setName(String newName) {
        if (newName.length()>0) {
            this.name = newName;
        }
    }

    /**
     * Name: setGenre
     * Description: set the genre of the song
     * @param newGenre new possible genre
     */
    public void setGenre(String newGenre){
        if (newGenre.length()>0) {
            this.genre = newGenre;
        }
    }

    /**
     * Name: setLength
     * Description: set the length of the song in seconds
     * @param newLength new possible length
     */
    public void setLength(Integer newLength) {
        if (newLength>0) {
            this.length = newLength;
        }
    }

    /**
     * Name: setAlbum
     * Description: set the album of the song
     * @param newAlbum new possible album
     */
    public void setAlbum(String newAlbum){
        if (newAlbum.length()>0) {
            this.album = newAlbum;
        }
    }

    /**
     * Name: setArtist
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
     * Name: songInteraction
     * Description: allows user to interact with the mp3 file (play, pause, stop)
     */
    public void songInteraction(Song testSong){
        Scanner sc = new Scanner(System.in);            // add scanner for pause and play prompt

        try {
            File f = new File("src\\Songs\\"+testSong.getMp3File());


            MP3Player player = new MP3Player(f);
            player.play();


            System.out.println("INSTRUCTIONS");
            System.out.println("p to play/pause");
            System.out.println("s to stop the music");
            System.out.println();


            while (!player.isStopped()) {
                String command = sc.nextLine();

                if (command.equalsIgnoreCase("s")) {
                    player.stop();
                    System. exit(1);
                } else if (command.equalsIgnoreCase("p")) {
                    if (player.isPaused()) {
                        player.play();
                    } else {
                        player.pause();
                    }
                }
            }

            int milliLength = testSong.getLength()*1000;

            Thread.sleep(milliLength);         // stops the program after song is finished

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     Name: toString
     Description: returns all song attributes
     @return song attributes (time in seconds)
     */
    public String toString() {
        String attributes;

        attributes = "Name: " + this.name + "\nGenre: " + this.genre + "\nTime: " + this.length + "\nAlbum: " + this.album + "\nArtist: " + this.artist + "\nMp3: " + this.mp3File;

        return attributes;
    }

    /**
     * Name: main
     * Description: testing methods
     */
    public static void main(String[] args) {
        // constructor
        // String title, int totalTime, String artist, String album, String genre
        Song mySong = new Song("Titanium (ft. Sia)", "Hip-Hop", 244, "Nothing but the Beat", "David Guetta", "Titanium (ft.Sia).mp3");

        // accessors
        System.out.println();
        System.out.println("ACCESSORS"); // accessor for each attribute

        System.out.println("Name: " + mySong.getName());
        System.out.println("Genre: " + mySong.getGenre());
        System.out.println("Time in seconds: " + mySong.getLength());
        System.out.println("Album: " + mySong.getAlbum());
        System.out.println("Artist: " + mySong.getArtist());
        System.out.println("Mp3: " + mySong.getMp3File());

        // mutators
        System.out.println();
        System.out.println("MUTATORS"); // all mutators for each attribute

        System.out.println("catching if the name is less then 1 character");
        mySong.setName("");   // invalid
        System.out.println(mySong.getName());
        mySong.setName("The Color Violet"); // valid
        System.out.println(mySong.getName());

        System.out.println("catching if the genre is less then 1 character");
        mySong.setGenre("");   // invalid
        System.out.println(mySong.getGenre());
        mySong.setGenre("Hip-Hop"); // valid
        System.out.println(mySong.getGenre());

        System.out.println("catching if the time is negative");
        mySong.setLength(-1);   // invalid
        System.out.println(mySong.getLength());
        mySong.setLength(226); // valid
        System.out.println(mySong.getLength());

        System.out.println("catching if the album is less then 1 character");
        mySong.setAlbum("");   // invalid
        System.out.println(mySong.getAlbum());
        mySong.setAlbum("Alone at Prom"); // valid
        System.out.println(mySong.getAlbum());

        System.out.println("catching if the artist is less then 1 character");
        mySong.setArtist("");   // invalid
        System.out.println(mySong.getArtist());
        mySong.setArtist("Tory Lanez"); // valid
        System.out.println(mySong.getArtist());

        // other methods
        System.out.println();
        System.out.println("OTHER METHODS");    // extra method (only 1)

        System.out.println("Demonstrating toString()");
        System.out.println(mySong.toString());          // output toString
    }
}

