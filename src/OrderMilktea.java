
public class OrderMilktea implements IOrder {
	Chef chef;
	OrderMilktea(Chef chef){
 		this.chef = chef;
 	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chef.makeMilktea();
	}

}
