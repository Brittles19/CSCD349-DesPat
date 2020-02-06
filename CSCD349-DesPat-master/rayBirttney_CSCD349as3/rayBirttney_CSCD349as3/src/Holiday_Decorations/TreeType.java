package Holiday_Decorations;

public  class TreeType implements HolidayItem {
	
	public TreeType(String treeName) {
		
	}
	
	private TreeType tree;
	private double cost;
	
	
	public TreeType getTreeType(HolidayItem treeName) 
	{
	 return (TreeType) this.tree;
	}
	
	public TreeType getTree(HolidayItem treePicked) {
		return this.getTreeType(treePicked);
	}
	public void descriptio(HolidayItem treeDecorationItem) {
		System.out.println("your " + this.tree.toString() +  " is ready for decoration " + " /n" + " it costs: " + treeCostByName((HolidayItem) tree, cost));
	}
	
	public double getCost() {
		return this.cost;
	}
	public double getCost(double cost) {
		return this.cost=cost;
	}
	
	public double treeCostByName(HolidayItem treeName, double treeCost) {
		return getTreeType(treeName).getTree(treeName).getCost(treeCost);
	}

	@Override
	public double cost() {
		return this.cost;
	}

	@Override
	public void description(HolidayItem treeDecoratorType) {
		// TODO Auto-generated method stub
		
	}
		

	
	
}

