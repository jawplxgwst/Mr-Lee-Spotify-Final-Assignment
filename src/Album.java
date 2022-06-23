/**
 * @author Henry Liu
 * Jun 7, 2022
 * 
 * A class for Albums
 */
 
import java.util.*;

public class Album {
   
   //attributes
   
   /** name of the album */
   private String name;
   
   /** length of the album in seconds */
   private int length;
   
   /** genre of the album */
   private String genre;
   
   /** number of songs in the album */
   private int songCount;
   
   /** array of song names from the album */
   //note: this attribute is public in order for the method in the EP class to access it
   public String[] songs;
   
   //constructors
   
   /** 
  * creating the album
  *
  * @param name, name of the album
  * @param bank, length, length of the album
  * @param genre, genre of the album
  * @param songCount, number of songs in the album
  * @param songs, string of song names in the album
  */
   public Album(String name, int length, String genre, int songCount, String[] songs) {
      this.name = name;
      this.length = length;
      this.genre = genre;
      
      // an album must have minimum 6 songs
      if (songCount < 6) {
         this.songCount = 6;
      } else {
         this.songCount = songCount;
      }
      
      this.songs = songs;
  }

   //accessor methods

   public String getName() {
      return this.name;
   }
   
   public int getLength() {
      return this.length;
   }
   
   public String getGenre() {
      return this.genre;
   }
   
   public int getSongCount() {
      return this.songCount;
   }
   
   public String[] getSongs() {
      return songs;
   }
   
  /**
   * shuffle method
   * returns the list of songs but in a new order
   *
   */
   public String shuffle() {
      ArrayList<String> songList = new ArrayList<String>();
      
      for (int i = 0; i < songCount; i++) {
			songList.add(songs[i]);
		}
      
      Collections.shuffle(songList);
      
      return songList + "";
   }
   
   /**
  * Main method
  * tests the class
  *
  */
   public static void main(String[] args) {
   
      //using Metallica's Master of Puppets as an example
      String[] MasterofPuppets = {"Battery", "Master of Puppets", "The Thing That Should Not Be", "Welcome Home (sanitarium)", "Disposable Heroes", "Leper Messiah", "Orion", "Damage, Inc."}; 
      
      //imo Metallica's 4th best album to be honest
      Album MetallicasBestAlbum = new Album("Master of Puppets", 3240, "Metal", 8, MasterofPuppets);
      
      //printing out the new shuffled album list
      System.out.println(MetallicasBestAlbum.shuffle());
      
   }
   
}