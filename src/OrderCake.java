
public class OrderCake implements IOrder {
Chef chef;
 	OrderCake(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeCake();
	}

}
