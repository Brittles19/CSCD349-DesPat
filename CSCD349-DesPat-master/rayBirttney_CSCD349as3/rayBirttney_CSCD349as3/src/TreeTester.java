

import Holiday_Decorations.HolidayItem;
import Holiday_Decorations.LEDS;
import Holiday_Decorations.Lights;
import Holiday_Decorations.Ornaments;
import Holiday_Decorations.Ruffles;
import Holiday_Decorations.TreeType;

public class TreeTester {

	public static void main(String[] args) {
		
		HolidayItem clarkGriswoldTree = new TreeType("blueSpruce");
		clarkGriswoldTree = (new Ornaments((HolidayItem)clarkGriswoldTree).red(clarkGriswoldTree)));
		//clarkGriswoldTree = new LEDS((HolidayItem)clarkGriswoldTree);
		//clarkGriswoldTree = new Lights((HolidayItem)clarkGriswoldTree);
		
		System.out.println(clarkGriswoldTree);

	}
	

	

}
