
public class OrderJuice implements IOrder {
	Chef chef;
	OrderJuice(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeJuice();
	}

}
