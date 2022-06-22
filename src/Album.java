/**
 * @author Henry Liu
 * Jun 7, 2022
 * 
 * A class for Albums
 */
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
   
   //constructors
   
   /** 
  * creating the album
  *
  * @param name, name of the album
  * @param bank, length, length of the album
  * @param genre, genre of the album
  * @param songCount, number of songs in the album
  */
   public Album(String name, int length, String genre, int songCount) {
      this.name = name;
      this.length = length;
      this.genre = genre;
      
      // an album must have minimum 6 songs
      if (songCount < 6) {
         this.songCount = 6;
      } else {
         this.songCount = songCount;
      }
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
   
}