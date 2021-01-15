
public class OrderChicken implements IOrder {
	Chef chef;
	OrderChicken(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeChicken();
	}

}
