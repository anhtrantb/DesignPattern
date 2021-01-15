import java.util.ArrayList;
public class Chef {
	String name;
	//gửi thông báo về việc hoàn thành món ăn cho tất cả các phục vụ 
	static ArrayList<IObserver> observers = new ArrayList<IObserver>();//dùng chung cho các lớp con 
	public static void attach(IObserver observer){
	      observers.add(observer);	//thêm các bồi bàn để thông báo 	
	   }
    public void notifyAllObservers(boolean status){
      for (IObserver observer : observers) {
         observer.update(status);//thông báo toàn bộ 
      }
    } 
    //----------------
    public Chef() {}
	public Chef(String name) {
		this.name = name;
	}
	ArrayList<Integer> canMake = new ArrayList<>();
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Integer> getDefaultCanMake(){
		ArrayList<Integer> defaultList= new ArrayList<>();
		defaultList.add(1);
		defaultList.add(2);
		defaultList.add(4);
		defaultList.add(9);
		return defaultList;
	}
	public  ArrayList<Integer> getCanMake(){
		return canMake;
	}
	public void setCanMake(int ...list) {
		for(int i: list) {
			this.canMake.add(i);
		}
	}
	//món ăn các đầu bếp đều biết đã làm xong 
	public void makeCake() {
		if(Ingredients.butter<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong bánh\n");
			notifyAllObservers(true);
			Ingredients.butter--;
		}
	}
	public void makeCream() {
		if(Ingredients.butter<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong kem\n");
			notifyAllObservers(true);
			Ingredients.butter--;
		}
	}
	public void makeChicken() {
		if(Ingredients.chicken<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong gà\n");
			notifyAllObservers(true);
			Ingredients.chicken--;
		}
	}
	public void makeCoffee() {
		if(Ingredients.coffee<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			notifyAllObservers(false);
		}else {
			System.out.print(this.getName()+" đã làm xong cà phê\n");
			notifyAllObservers(true);
			Ingredients.coffee--;
		}
	}
	
	//----------------------------------------
	//món mà các đầu bếp có thể làm  riêng 
	public void makeHamberger() {}
	public void makeJuice() {}
	public void makeMeat() {}
	public void makeMilktea() {}
	public void makeNoodles() {}
	public void makeSoda() {}
}
