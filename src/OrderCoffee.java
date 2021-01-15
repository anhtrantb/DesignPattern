
public class OrderCoffee implements IOrder {
	Chef chef;
	OrderCoffee(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeCoffee();
	}

}
