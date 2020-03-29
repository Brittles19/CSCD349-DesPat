package Holiday_Decorations;

public class Star extends TreeDecorator {
	
	private Star(HolidayItem star) {
		super(star);
	}
	
	public final static HolidayItem getStar(TreeType tree) {
		return Star.getStar(tree);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 4.00;
	}

	@Override
	public void description(HolidayItem decoration) {
		super.treeDecorationItem.description(decoration);
		
		
	}
}
