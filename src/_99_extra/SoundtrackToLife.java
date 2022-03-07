
package _99_extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.

		int userMood = JOptionPane.showOptionDialog(null, "Are you feeling...", "Mood Asker", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Angry", "Stressed", "Happy" }, null);
		System.out.println(userMood);

		// 2. Their answer is stored in the userMood variable. Print it out.
//stressed=1
//happy=2
//angry=0
		if(userMood==1) {
			playVideo("https://www.youtube.com/watch?v=D-UmfqFjpl0");
		}else if(userMood==0) {
		    playVideo("https://www.youtube.com/watch?v=Ct6BUPvE2sM");
		}else if(userMood==2) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		}
		
		
		
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		

		
		// 4. Play different songs for other moods.

/**
* If you can't think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



