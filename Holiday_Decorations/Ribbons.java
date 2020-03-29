package Holiday_Decorations;

public class Ribbons extends TreeDecorator {

	public Ribbons(HolidayItem ribbons) {
		super(ribbons);
	}
	
	private Ribbons ribbons;
	
	public Ribbons getRibbons() {
		return this.ribbons;
	}
	
	public Ribbons getRibbons(HolidayItem ribbons) {
		return this.ribbons = (Ribbons) ribbons;
	}

	@Override
	public double cost() {
		
		return 2.00;
	}

	@Override
	public void description(HolidayItem ribbons) {
		super.description(this.ribbons);
		
	}
	

}
