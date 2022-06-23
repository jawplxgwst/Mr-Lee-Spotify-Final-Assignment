/**
 * @author Henry Liu
 * Jun 7, 2022
 * 
 * A class for EPs which extends the album class
 */
 
import java.util.*;

public class EP extends Album {
   
   //attributes
   
   /** name of the album */
   //private String name;
   
   /** length of the album in seconds */
   //private int length;
   
   /** genre of the album */
   //private String genre;
   
   /** number of songs in the album */
   //private int songCount;
   //_____________________________
   //note: this attribute is useless in the EP class
   
   /** array of song names from the album */
   //private String[] songs;
   
   /** number of songs in the EP */
   private int epSongCount;
   
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
   public EP(String name, int length, String genre, int songCount, String[] songs, int epSongCount) {
      super(name, length, genre, songCount, songs);
      //this.name = name;
      //this.length = length;
      //this.genre = genre;
      
      // an album must have minimum 6 songs
      /*if (songCount < 6) {
         this.songCount = 6;
      } else {
         this.songCount = songCount;
      }*/
      
      //this.songs = songs;
      this.epSongCount = epSongCount;
  }

   //accessor methods

   /*public String getName() {
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
   }*/
   
   public int getEPSongCount() {
      return epSongCount;
   }
   
  /**
   * shuffle method
   * returns the list of songs but in a new order
   *
   */
   /*public String shuffle() {
      ArrayList<String> songList = new ArrayList<String>();
      
      for (int i = 0; i < songCount; i++) {
			songList.add(songs[i]);
		}
      
      Collections.shuffle(songList);
      
      return songList + "";
   }*/
   
  /**
   * shuffle method for EP
   * returns the list of songs but in a new order
   *
   */
   public String shuffleEP() {
      ArrayList<String> songList = new ArrayList<String>();
      
      for (int i = 0; i < epSongCount; i++) {
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
   
      //using Pink Floyd's See Emily Play as an example
      String[] SeeEmilyPlay = {"See Emily Play", "Scarecrow", "Arnold Layne", "Candy and a Currant Bun"}; 
      
      //not Dark Side of the Moon leve iconic but still iconic
      EP PinkFloydsIconicEP = new EP("See Emily Play", 623, "Rock", 99, SeeEmilyPlay, 4);
      
      PinkFloydsIconicEP.getSongs();
      
      //printing out the EP
      System.out.println(PinkFloydsIconicEP.shuffleEP());
      
   }
   
}