
public class OrderNoodles implements IOrder {
	Chef chef;
	OrderNoodles(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeNoodles();
	}

}
