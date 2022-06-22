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


        public void songInteraction(Song testSong){

            try {
                File f = new File("src\\Songs\\Screaming.mp3");


                MP3Player player = new MP3Player(f);
                player.play();


                System.out.println("INSTRUCTIONS");
                System.out.println("p to play/pause");
                System.out.println("s to stop the music");
                System.out.println();


                while (!player.isStopped()) {
                    String command = sc.nextLine();

                    if (command.equalsIgnoreCase("s")) {
                        player.stop();
                    } else if (command.equalsIgnoreCase("p")) {
                        if (player.isPaused()) {
                            player.play();
                        } else {
                            player.pause();
                        }
                    }
                }
                Thread.sleep();         // stops the program after song is finished

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
