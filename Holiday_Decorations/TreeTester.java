import Holiday_Decorations.*;
import Holiday_Decorations.Star;
public class TreeTester {
    public static void main(String[] args) throws Throwable {
        HolidayItem holidayItem = new TreeType().ColoradoBlueSpruce();
        holidayItem.description();
        holidayItem = new Ruffles(holidayItem);
        holidayItem.description();
        holidayItem = new LEDS(holidayItem);
        holidayItem.description();
        HolidayItem holidayItem2 = new TreeType().douglasFur();






    }
    public double calculateCost(){
        return 0.00;
    }
    }
