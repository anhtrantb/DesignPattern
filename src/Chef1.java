import java.util.ArrayList;

public class Chef1 extends Chef{
	public Chef1(String name) {
		super(name);
	}
	//các món ăn biết đã làm xong riêng 
	public void makeHamberger() {
		if(Ingredients.butter<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong hamberger\n");
			super.notifyAllObservers(true);
			Ingredients.butter--;
		}
	}
	public void makeJuice() {
		if(Ingredients.fruit<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong nước ép\n");
			super.notifyAllObservers(true);
			Ingredients.fruit--;
		}
	}
	public void makeMeat() {
		if(Ingredients.pork<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong thịt\n");
			super.notifyAllObservers(true);
			Ingredients.pork--;
		}
	}
	//món mà đầu bếp 2 và đầu bếp 1 đều  biết đã làm xong 
	public void makeMilktea() {
		if(Ingredients.milk<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong trà sữa\n");
			super.notifyAllObservers(true);
			Ingredients.milk--;
		}
	}
	
	public ArrayList<Integer> getCanMake() {
		this.setCanMake(3,6,7,8);//món mà khả năng riêng của đầu bếp 
		ArrayList<Integer> list= super.getDefaultCanMake();
		list.addAll(canMake);
		return list;
	}
	
}

