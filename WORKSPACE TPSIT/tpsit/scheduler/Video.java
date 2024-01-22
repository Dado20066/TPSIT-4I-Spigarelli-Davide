package scheduler;

public class Video {
    public String name;
    public int duration;
    public int displayed;

    public Video(String name, int duration, int displayed) {
        this.name = name;
        this.duration = duration;
        this.displayed = displayed;
        
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
    
    public int getdisplayed() {
        return displayed;
    }

    public void reduceDuration(int seconds) {
        duration -= seconds;
    }
    
    public void increaseDisplayed(int seconds) {
        displayed += seconds;
    }
}
