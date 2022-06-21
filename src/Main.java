/**
 * @author James Wong
 * Jun 16 2022
 *
 * Spotify main
 */

// imported packages
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String [] args){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Music File.txt"));      // create buffered reader to read in file

            String songInfo;        // variable to hold the song information

            // while there is still text to read
            while((songInfo = br.readLine()) != null){
                System.out.println(songInfo);
                while ((songInfo = br.readLine()) != ""){
                    ArrayList<String> songList = new ArrayList<String>();
                }
            }

            br.close();         // Close the reader

            System.out.print("IT WORKS");       // delete later

        } catch (Exception e) {
            System.out.println("Error Occurred");
            return;
        }
    }
}

