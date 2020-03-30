package Holiday_Decorations;

public abstract class Lights extends TreeDecorator{
		private Lights treeDecorations;
	public Lights(HolidayItem treeDecorations) {
		super(treeDecorations);
		
	}


	public double cost() {
		return 5.00;
	}

	@Override
	public void description(HolidayItem lights) throws Throwable {
		super.treeDecorationItem.description();
		
	}
	
	

}
