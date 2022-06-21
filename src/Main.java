/**
 * @author James Wong
 * Jun 16 2022
 *
 * Spotify main
 */

// imported packages
import java.io.*;

public class Main {

    public static void main(String [] args){

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jzwon\\Desktop\\GitHub Projects\\Mr-Lee-Spotify-Final-Assignment\\src\\Music File.txt"));

            String songList;
            while((songList = br.readLine()) != null){
                System.out.println(songList);
                //Song mySong = new Song();
                //Song mySong = new Song("Secrets", "Hip-Hop", 260, "Starboy", "The Weeknd");
            }
            br.close();
        } catch (Exception e) {
            return;
        }
    }
}

