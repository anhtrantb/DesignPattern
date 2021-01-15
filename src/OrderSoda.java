
public class OrderSoda implements IOrder {
	Chef chef;
	OrderSoda(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeSoda();
	}

}
