/**
 * @author James Wong
 * Jun 16 2022
 *
 * Play Audio
 */

// imported packages
import jaco.mp3.player.MP3Player;       // jaco-mp3-player-0.9.3.jar
import java.io.File;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // add scanner for pause and play prompt



        try {
            File f = new File("C:\\Users\\jzwon\\Desktop\\GitHub Projects\\Mr-Lee-Spotify-Final-Assignment\\src\\Titanium.mp3");


            MP3Player player = new MP3Player(f);
            player.play();


            System.out.println("INSTRUCTIONS");
            System.out.println("p to play/pause");
            System.out.println("s to stop the music");
            System.out.println();
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("s")) {
                player.isStopped();
            }

            while (!player.isStopped()) {
                // System.out.println(4);
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
