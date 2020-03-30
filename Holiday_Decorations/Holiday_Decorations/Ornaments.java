package Holiday_Decorations;

public class Ornaments extends TreeDecorator {

	
	public Ornaments(HolidayItem ornaments) {
		super(ornaments);
		
	}
	private Ornaments ornaments;
	
	
	
	private double cost;
	
//	public Ornaments getOrnaments() {
//		return (Ornaments) this.ornaments;
//	}
//	 
	public HolidayItem getOrnament(Ornaments ornaments) {
		return this.ornaments = ornaments;
	}



	public double silver(HolidayItem silverO) {
		 return super.treeDecorationItem.cost();
		
		
		
	}
	 public double red(HolidayItem redO) {
		return super.treeDecorationItem.cost();
		
		
		
	}
	 public double getCost(double cost) {//method overloading
		 return this.cost = cost;
	 }
	 
	 public double getCost() { //method overloading 
		 return this.cost;
	 }
	
	public double cost(double cost) { // this section seems awful with regards to codeSmells
		return this.cost = getCost(cost);
}
	@Override
	public double cost() {
		return super.treeDecorationItem.cost();
	}

	@Override
	public void description() throws Throwable {
		System.out.println("Ornaments have been added");
	}


}

	
	
	


