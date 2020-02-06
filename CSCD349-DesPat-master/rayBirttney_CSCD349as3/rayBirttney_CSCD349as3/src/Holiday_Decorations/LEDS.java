package Holiday_Decorations;

public class LEDS extends TreeDecorator {
	
	public LEDS(HolidayItem leds) {
		super(leds);
		// TODO Auto-generated constructor stub
	}
	private LEDS leds;
	
	public LEDS getLEDS() {
		return this.leds;
	}

	@Override
	public double cost() {
		
		return 10.00;
	}
	
	public LEDS getLEDS(HolidayItem leds) {
		return this.leds = (LEDS) leds;
	}

	@Override
	public void description(HolidayItem LEDS) {
		 super.description(LEDS);
		
	}


}
