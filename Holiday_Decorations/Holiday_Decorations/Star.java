package Holiday_Decorations;

public class Star extends TreeDecorator {

	private static Star starInstance;
	public Star() { }


	public static Star getStarInstance() throws Throwable {
		if (starInstance.equals(null))
			starInstance= new Star();
		return starInstance;
	}
	protected void finalize() throws Throwable {
		try {
			this.treeDecorationItem = new Star();
		} finally {
			super.finalize();
		}
	}
	@Override
	public double cost() {
		return 0;
	}

	@Override
	public void description() throws Throwable {
		if(!(starInstance.equals(null))){
			System.out.println("There is already a star on the tree");
			super.finalize();
		}
		else{
			System.out.println("A Star has been added to the tree");
		}
	}
}
