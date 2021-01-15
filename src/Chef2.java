import java.util.ArrayList;

public class Chef2 extends Chef {
	public Chef2(String name){
		super(name);
	}
	//các món ăn biết đã làm xong riêng 
	public void makeNoodles() {
		if(Ingredients.pork<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong phở\n");
			super.notifyAllObservers(true);
			Ingredients.pork--;
		}
	}
	public void makeSoda() {
		if(Ingredients.fruit<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong soda\n");
			super.notifyAllObservers(true);
			Ingredients.fruit--;
		}
	}
	//món mà đầu bếp 2 và đầu bếp 1 đều  biết đã làm xong 
	public void makeMilktea() {
		if(Ingredients.milk<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong trà sữa \n");
			super.notifyAllObservers(true);
			Ingredients.milk--;
		}
	}
	public ArrayList<Integer> getCanMake() {
		this.setCanMake(3,5,10);//món mà khả năng riêng của đầu bếp 
		ArrayList<Integer> list= super.getDefaultCanMake();
		list.addAll(canMake);
		return list;
	}
}
