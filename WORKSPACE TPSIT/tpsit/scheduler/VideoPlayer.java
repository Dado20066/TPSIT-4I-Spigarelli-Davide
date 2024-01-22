package scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VideoPlayer {

	public static void main(String[] args) {

		int totalTime = 0;
		int randomNumber = 0;
		int displayTime = 1;

		/*
		 * List of videos
		 */
		
		List<Video> videoList = new ArrayList<>();
		videoList.add(new Video("Video1", 3, 0));
		videoList.add(new Video("Video2", 6, 0));
		videoList.add(new Video("Video3", 9, 0));
		videoList.add(new Video("Video4", 12, 0));

		/*
		 * calculate the bigger duration
		 */
		
		int biggerDuration = 0;
		for (int x = 0; x < videoList.size(); x++) {
			if (videoList.get(x).getDuration() > biggerDuration) {
				biggerDuration = videoList.get(x).getDuration();
			}
		}

		/*
		 * declaration of lastRandom variable, initially is the size of the list plus
		 * one because it shoudn't be possible to equal to the first random number
		 */

		int lastRandom = videoList.size() + 1;

		/*
		 * riproduct the videos
		 */
		
		while (videoList.get(0).duration > 0 || videoList.get(1).duration > 0 || videoList.get(2).duration > 0
				|| videoList.get(3).duration > 0

		) {
			/*
			 * Generating a random integer beetween 0 and the number of video
			 */
			
			Random random = new Random();
			randomNumber = random.nextInt(4);

			if (lastRandom != randomNumber) {
				Video videoInPlaying = videoList.get(randomNumber);

				videoInPlaying.reduceDuration(displayTime);
				videoInPlaying.increaseDisplayed(displayTime);
				System.out.println(videoInPlaying.getName());

			}

			lastRandom = randomNumber;

		}
		for (int x = 0; x < videoList.size(); x++) {
			System.out.println("video " + (x + 1) + " mostrato per " + videoList.get(x).getdisplayed() + " secondi");

		}

	}

}
