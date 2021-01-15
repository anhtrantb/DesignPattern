
public class OrderHamberger implements IOrder {
	Chef chef;
	OrderHamberger(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeHamberger();
	}

}
