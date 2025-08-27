package mediaplayer;

/**
 * Adapter for LegacyVideoPlayer to MediaPlayer interface.
 */
public class VideoPlayerAdapter implements MediaPlayer {
    /**
     * Adapted legacy video player instance.
     */
    private final LegacyVideoPlayer legacy;

    public VideoPlayerAdapter(final LegacyVideoPlayer legacyPlayer) {
        this.legacy = legacyPlayer;
    }

    @Override
    public void play(final String fileName) {
        if (!fileName.toLowerCase().endsWith(".mp4")) {
            throw new IllegalArgumentException("Only .mp4 files supported by adapter");
        }
        legacy.playVideo(fileName);
    }

}
