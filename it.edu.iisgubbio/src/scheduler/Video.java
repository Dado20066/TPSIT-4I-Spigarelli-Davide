package scheduler;

/**
 * The Video class represents a video with its name, duration, and displayed time.
 */
public class Video {
    /** The name of the video. */
    public String name;

    /** The duration of the video in seconds. */
    public int duration;

    /** The total time the video has been displayed in seconds. */
    public int displayed;

    /**
     * Constructs a new Video object with the specified name, duration, and displayed time.
     *
     * @param name      The name of the video.
     * @param duration  The duration of the video in seconds.
     * @param displayed The total time the video has been displayed in seconds.
     */
    public Video(String name, int duration, int displayed) {
        this.name = name;
        this.duration = duration;
        this.displayed = displayed;
    }

    /**
     * Gets the name of the video.
     *
     * @return The name of the video.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the duration of the video in seconds.
     *
     * @return The duration of the video.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Gets the total time the video has been displayed in seconds.
     *
     * @return The total displayed time of the video.
     */
    public int getDisplayed() {
        return displayed;
    }

    /**
     * Reduces the duration of the video by the specified number of seconds.
     *
     * @param minutes The number of seconds to reduce from the video duration.
     */
    public void reduceDuration(int minutes) {
        duration -= minutes;
    }

    /**
     * Increases the total displayed time of the video by the specified number of seconds.
     *
     * @param minutes The number of seconds to add to the total displayed time.
     */
    public void increaseDisplayed(int minutes) {
        displayed += minutes;
    }
}