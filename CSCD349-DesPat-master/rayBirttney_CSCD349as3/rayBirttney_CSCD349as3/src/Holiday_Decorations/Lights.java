package Holiday_Decorations;

public class Lights extends TreeDecorator{

	public Lights(HolidayItem treeDecorations) {
		super(treeDecorations);
		
	}

	@Override
	public double cost() {
		return 5.00;
	}

	@Override
	public void description(HolidayItem lights) {
		super.treeDecorationItem.description(lights);
		
	}
	
	

}
