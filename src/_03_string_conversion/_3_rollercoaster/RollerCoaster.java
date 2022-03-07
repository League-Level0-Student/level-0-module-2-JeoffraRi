package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
	public static void main(String[] args) {
		
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
	String heightToRide = JOptionPane.showInputDialog(null, " You walk up to the roller coaster entryway. The operator stands next to a sign that reads, ENTER YOUR HEIGHT IN INCHES.");
		// Uncomment the line below...
	int heightAsInt = Integer.parseInt(heightToRide);
	JOptionPane.showMessageDialog(null,"After writing down your height and showing it to the operator, you ask him if you can ride.");
if( heightAsInt > 42 ){
	JOptionPane.showMessageDialog(null,"\"You can TOTALLY ride the roller coaster, man!\" The ride operator spreads his arms out wide and ushers you onto the ride.");	
			}else if ( heightAsInt < 42 ) {
	JOptionPane.showMessageDialog(null,"\"No my dude! No way! U cant ride the roller coaster! Bro, ya gotta by at least FORTY-TWO inches!!! You, my friend, are bonkers!\" The ride operator yells at you, then storms off.");	
			}
	}
void yes() {

}

		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"

}