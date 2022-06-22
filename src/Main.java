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
            BufferedReader br = new BufferedReader(new FileReader("src\\Titanium ft. (Sia).txt"));      // create buffered reader to read in file

            String[] songInfo = new String[6];        // variable to hold the song information

            for (int i = 0; i<6; i++) {
                songInfo[i] = br.readLine();
            }

            Song musicPlay = new Song(songInfo[0],songInfo[1],Integer.valueOf(songInfo[2]), songInfo[3],songInfo[4],songInfo[5]);

            br.close();         // Close the reader

        } catch (Exception e) {
            System.out.println("Error Occurred");
            return;
        }



    }
}

