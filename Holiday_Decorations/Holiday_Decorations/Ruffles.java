package Holiday_Decorations;

public class Ruffles extends TreeDecorator {
	public Ruffles(HolidayItem tree) {
		super((HolidayItem) tree);
	
	}

	private Ruffles ruffle;
	
	public void addRuffle(Ruffles ruffle)  {
		this.ruffle = ruffle;
		
	}
	
	public Ruffles getRuffle() {
		return this.ruffle;
	}

	@Override
	public double cost() {
		return 1.00;
	}

	@Override
	public void description() {
		System.out.println("Ruffles have been added ");

		
	}




}
