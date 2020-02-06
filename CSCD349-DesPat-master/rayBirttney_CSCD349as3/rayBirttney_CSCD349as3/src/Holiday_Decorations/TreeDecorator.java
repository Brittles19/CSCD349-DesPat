package Holiday_Decorations;

public abstract class TreeDecorator implements HolidayItem {

	protected HolidayItem treeDecorationItem; //wrapped item
	
	
	public TreeDecorator(HolidayItem treeDecorations) {
		this.treeDecorationItem = treeDecorations;
		
	}

	public TreeDecorator getTreeDecorationType() {
		return (TreeDecorator) this.treeDecorationItem;
	}

	public void description(HolidayItem treeDecoratorType) {
		
		System.out.println(("You added: " + this.treeDecorationItem + " /n " + " the cost for this item is: " +  this.treeDecorationItem.cost()));
	}
	

	
	
}
	

