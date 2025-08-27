package mediaplayer;

/**
 * Main application class.
 */

public class App {
    /**
     * Main method to demonstrate the adapter pattern.
     *
     * @param args command line arguments
     */

    public static void main(final String[] args) {
        final MediaPlayer player = new AudioPlayer();
        player.play("song.mp3");
        player.play("song.mp4");
    }
}
