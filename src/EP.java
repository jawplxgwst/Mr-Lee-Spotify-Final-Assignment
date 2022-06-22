/**
 * @author Henry Liu
 * Jun 7, 2022
 * 
 * A class for Albums
 */
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
   
   private String[] songs;
   
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
   *
   */
   public String shuffle() {
      
   }
   
   /**
  * Main method
  * tests the class
  *
  */
   public static void main(String[] args) {
   
      
      
   }
   
}