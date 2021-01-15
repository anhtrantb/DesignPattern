
public class OrderMeat implements IOrder {
	Chef chef;
	OrderMeat(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeMeat();
	}

}
