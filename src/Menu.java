import java.util.ArrayList;

public class Menu {
	private ArrayList<String> menuFood = new ArrayList<>();
	//thiết lập menu mặc định cho quán 
	public void initMenu() {
		menuFood.add("Cake");//1
		menuFood.add("Cream");//2
		menuFood.add("MilkTea");//3
		menuFood.add("Coffee");//4
		menuFood.add("Soda");//5
		menuFood.add("Juice");//6
		menuFood.add("Meat");//7
		menuFood.add("Hamberger");//8
		menuFood.add("Chicken");//9
		menuFood.add("Noodles");//10
	}
	//lấy menu ra 
	public ArrayList<String> getMenu(){
		return this.menuFood;
	}
	//thêm đồ ăn vào menu
	public void addFood(String food) {
		menuFood.add(food);
	}
	//xóa toàn bộ menu
	public void clearMenu() {
		menuFood.clear();
	}
	//lấy tên đồ ăn 
	public String getFoodName(int index) {
		return menuFood.get(index);
	}
	//lấy danh sách menu
	public void printMenu() {
		int i=0;
		for(i=0;i<menuFood.size();i++) {
			System.out.println((i+1)+":"+menuFood.get(i));
		}
	}
	public void printFirstNotification() {
		System.out.println("1. gọi món");
		System.out.println("2. phàn nàn dịch vụ");
	}
	public void printComplainChoice() {
		System.out.println("1. thái độ phục vụ không tốt");
		System.out.println("2. món ăn không ngon");
		System.out.println("3. giá tiền có sai sót");
	}
}
