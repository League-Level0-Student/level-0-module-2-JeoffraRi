
package _99_extra;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		// 13. Set the speed to 8
robot.setSpeed(8);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
int xRobot = 10;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
int yRobot = 600;
		// 8. Make a variable to hold the star size and set it to 25
int starSize = 25;
		// 12. Repeat the steps #19 to #18, 30 times
		//for (int i = 0; i < 30; i++) {
	//robot.setPenWidth(i);
	
		//}
			// 19. Set the pen width to i 
	
			// 10. Set the X position of the robot to your X variable
	//robot.setX(xRobot);
			// 11. Set the Y position of the robot to your Y variable
	//robot.setY(yRobot);
			// 9. Call the drawStar() method with your star size variable
	drawStar(starSize);
			// 14. Increase the X position by star size. See Figure 2.
	
			// 15. decrease the Y position by star size. See Figure 3.
	
			// 16. Increase the star size by 20
	
			// 17. Turn the robot 12 degrees
	
			// 18. Make each star a different random color like in Figure 4. 

	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
robot.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
for (int f = 0; f < 4; f++) {
for (int c = 0; c < 18; c++) {
	for (int i = 0; i < 5; i++) {
		robot.setSpeed(500);
		System.out.println("\nc" + c + " i" + i + " 1");
		robot.penDown();
		System.out.println("c" + c + " i" + i + " 2");
		robot.move(200);
		System.out.println("c" + c + " i" + i + " 3");
		robot.turn(144);
		System.out.println("c" + c + " i" + i + " 4");
	}
	robot.penUp();
	System.out.println("\nc" + c + " 5");
	robot.turn(20);
	System.out.println("c" + c + " 6");
	robot.move(35);
	System.out.println("c" + c + " 7");
	
}
robot.turn(90);
robot.move(800);
}

robot.hide();


			// 1. Move the robot the distance of the starSize variable
		//robot.setSpeed(5);
		//	robot.move(starSize);
			
			// 3. Turn the robot 144 degrees
			robot.turn(144);
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





