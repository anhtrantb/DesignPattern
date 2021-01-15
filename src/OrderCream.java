
public class OrderCream implements IOrder {
Chef chef;
	OrderCream(Chef chef){
		this.chef = chef;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeCream();
	}

}
