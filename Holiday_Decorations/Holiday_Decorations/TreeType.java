package Holiday_Decorations;


import com.sun.deploy.security.SelectableSecurityManager;

public  class TreeType extends TreeDecorator {


	public TreeType(double cost) {
		this.cost = cost;
	}

	public TreeType() {

	}


	@Override
	public String toString() {
		return "TreeType{" +
				"coloradoBlueSpruce=" + coloradoBlueSpruce +
				", douglasFir=" + douglasFir +
				", balsamFir=" + balsamFir +
				", fraserFur=" + fraserFur +
				", cost=" + cost +
				'}';
	}
	private TreeType tree;
	private double cost;
	private TreeType douglasFir;
	private TreeType balsamFir;
	private TreeType fraserFur;
	private TreeType coloradoBlueSpruce;


	public HolidayItem ColoradoBlueSpruce() { this.tree =  this.coloradoBlueSpruce; }
	public HolidayItem BalsamFir(){ this.tree = this.balsamFir; }
	public HolidayItem FraserFur(){ this.tree = this.fraserFur;}
	public HolidayItem douglasFur(TreeType tree){
		this.tree = this.douglasFir
	}



	public double getCost() {
		double cost = 0.00;
		if(this.tree.equals(this.coloradoBlueSpruce)) {
			cost = 5.00;
		}
		if (this.tree.equals(this.balsamFir)){
				cost = 6.00;
			}
		if(this.tree.equals(douglasFir)){
			cost = 9.00;
		}
		if(this.tree.equals(fraserFur)){
			cost = 10.00;
		}
		return this.cost = cost;


	}

	@Override
	public double cost() {
		return this.cost;
	}

	@Override
	public void description() throws Throwable {
		if(this.tree.equals(this.coloradoBlueSpruce)) {
			System.out.println("You picked a Colorado Blue Spruce ");
		}
		if (this.tree.equals(this.balsamFir)){
			System.out.println("You picked a Balsam Fir ");
		}
		if(this.tree.equals(douglasFir)){
			System.out.println("You picked a Douglas Fir ");
		}
		if(this.tree.equals(fraserFur)) {
			System.out.println("You picked a Fraser Fir ");
		}
		else{

		}

	}





}

