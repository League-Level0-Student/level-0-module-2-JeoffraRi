//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below

	// 2. Get the user to enter a question for the 8 ball to answer
	
	String question = JOptionPane.showInputDialog(null, "Ask the Magic Eight Ball a question:");
	// 4. If they typed in "yell":

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random answer = new Random();
	
	int randomNumber = answer.nextInt(4);
	
	// 4. If the random number is 0
if(randomNumber==0) {
	JOptionPane.showMessageDialog(null,"BETTER NOT TELL YOU NOW.");		  
}
	// -- tell the user "Yes"

	// 5. If the random number is 1
if(randomNumber==1) {
	JOptionPane.showMessageDialog(null,"REPLY HAZY. TRY AGAIN LATER.");
}
	// -- tell the user "No"

	// 6. If the random number is 2
if(randomNumber==2) {
	JOptionPane.showMessageDialog(null,"WITHOUT A DOUBT.");
}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
if(randomNumber==3) {
	JOptionPane.showMessageDialog(null,"OUTLOOK NOT GOOD.");
	// -- write your own answer

}
}
}