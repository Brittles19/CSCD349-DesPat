package Holiday_Decorations;

public class LEDS extends TreeDecorator {

	private LEDS leds;

	public LEDS(HolidayItem leds) {
		super(leds);
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public double cost() {
		
		return 10.00;
	}

	@Override
	public void description() throws Throwable {

		System.out.println("LEDS have been added to the tree " + "\n");
	}

	public LEDS getLEDS(HolidayItem leds) {
		return (LEDS) super.getTreeDecorationType();
	}




}
