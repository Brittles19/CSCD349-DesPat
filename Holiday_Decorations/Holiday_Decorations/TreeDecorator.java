package Holiday_Decorations;

public abstract class TreeDecorator implements HolidayItem  {

	protected HolidayItem treeDecorationItem; //wrapped item
	protected Double cost;
	
	
	public TreeDecorator(HolidayItem treeDecorations, double treeCost) {

		
	}

	public TreeDecorator(HolidayItem item) {
	}

	public TreeDecorator() {

	}


	public TreeDecorator getTreeDecorationType() {
		return (TreeDecorator) this.treeDecorationItem;
	}

	public void description(HolidayItem treeDecoratorType) throws Throwable {
		
		System.out.println(("You added: " + this.treeDecorationItem + " /n " + " the cost for this item is: " +  this.treeDecorationItem.cost()));
	}
	

	
	
}
	

