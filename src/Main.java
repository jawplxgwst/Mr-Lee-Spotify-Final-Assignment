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
            BufferedReader br = new BufferedReader(new FileReader("src\\Music File.txt"));      // create buffered reader to read in file

            String songList;        // variable to hold the song information

            // while there is still text to read
            while((songList = br.readLine()) != null){
                System.out.println(songList);
            }

            br.close();         // Close the reader

            System.out.print("IT WORKS");

        } catch (Exception e) {
            System.out.println("Error Occurred");
            return;
        }
    }
}

