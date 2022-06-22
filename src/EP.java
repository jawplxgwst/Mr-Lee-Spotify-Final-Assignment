/**
 * @author Henry Liu
 * Jun 7, 2022
 * 
 * A class for EPs, which are albums but shorter
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
   
   /** number of songs in the EP */
   private int EPsongCount;
   
   //constructors
   
   /** 
  * creating the album
  *
  * @param name, name of the album
  * @param bank, length, length of the album
  * @param genre, genre of the album
  * @param songCount, number of songs in the album
  * @param EPsongCount, number of songs in the EP
  */
   public EP(String name, int length, String genre, int songCount, int EPsongCount) {
      super(name, length, genre, songCount);
      //this.name = name;
      //this.length = length;
      //this.genre = genre;
      //this.songCount = songCount
      
      // instead of using songCount, EPsongCount is a new attribute assigned
      // EPs cannot have more than 5 songs
      if (EPsongCount > 5) {
         this.EPsongCount = 5;
      } else if (EPsongCount < 1) {
         this.EPsongCount = 1;
      } else {
         this.EPsongCount = EPsongCount;
      }
   }

   //accessor methods

 /*public String getName() {
      return this.name;
   }*/
   
 /*public int getLength() {
      return this.length;
   }*/
   
 /*public String getGenre() {
      return this.genre;
   }*/
   
 /*public String getSongCount() {
      return this.songCount;
   }*/
   
   public int getEPsongCount() {
      return this.EPsongCount;
   }
   
   public static void main(String[] args) {
        
      EP ded = new EP("dread", 8000, "pop", 10, 3);
        
   }
}