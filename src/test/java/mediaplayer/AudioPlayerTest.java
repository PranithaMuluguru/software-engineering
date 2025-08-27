package mediaplayer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AudioPlayerTest {
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void playsMp3Directly() {
        new AudioPlayer().play("track.mp3");
        assertTrue(out.toString().contains("AudioPlayer playing mp3: track.mp3"));
    }

    @Test
    void playsMp4ViaAdapter() {
        new AudioPlayer().play("video.mp4");
        assertTrue(out.toString().contains("LegacyVideoPlayer playing mp4: video.mp4"));
    }

    @Test
    void adapterRejectsUnsupported() {
        MediaPlayer adapter = new VideoPlayerAdapter(new LegacyVideoPlayer());
        assertThrows(IllegalArgumentException.class, () -> adapter.play("clip.avi"));
    }
}
