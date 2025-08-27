package mediaplayer;

/**
 * AudioPlayer class that handles both audio and video playback.
 */
public class AudioPlayer implements MediaPlayer {
    /**
     * Adapter for handling video playback.
     */
    private final MediaPlayer videoAdapter = new VideoPlayerAdapter(new LegacyVideoPlayer());

    /**
     * Plays the specified media file.
     *
     * @param fileName the name of the file to play
     */

    @Override
    public void play(final String fileName) {
        if (fileName.toLowerCase().endsWith(".mp3")) {
            System.out.println("AudioPlayer playing mp3: " + fileName);

        } else {
            videoAdapter.play(fileName);
        }
    }
}
