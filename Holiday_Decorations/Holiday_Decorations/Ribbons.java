package Holiday_Decorations;

public class Ribbons extends TreeDecorator {

	private Ribbons ribbons;

	public Ribbons(HolidayItem ribbons) {


		super(ribbons);
	}

	public HolidayItem getRibbons(Ribbons ribbons) {
		return (HolidayItem) (this.ribbons = ribbons);
	}


	public double cost() { return 2.00; }

	@Override
	public void description() throws Throwable {

		System.out.println("Ribbons have been added to: " + "\n ");
	}







}
