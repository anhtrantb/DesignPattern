import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int choice = 0;
		int numberChosen = 0;
		//thiết lập menu
		Menu menu = new Menu();
		menu.initMenu();
		//phục vụ trong quán
		Waiter waiter = new Waiter();//hiện tại có một phục vụ 
		//quản lí đầu bếp 
		ManageChef manage = new ManageChef();
		Chef chef1 = new Chef1("đầu bếp 1");
		Chef chef2 = new Chef2("đầu bếp 2");
		Chef.attach(waiter);//thêm bồi bàn vào để thông báo 
		manage.addChef(chef1);
		manage.addChef(chef2);
		//tạo ra các order 
		OrderFoodFactory orderFoodFactory = new OrderFoodFactory(manage);
		//bộ phận xử lí lỗi 
		HandleComplain manager = Manager.getInstance();
		HandleComplain director = Director.getInstance();
		waiter.setNextHandleComplain(manager);
		manager.setNextHandleComplain(director);
		
		//chương trình chạy theo lựa chọn của khách hàng 
		Scanner scanner = new Scanner(System.in);
		while(true) {//khách đến liên tục 
			//xuất menu ra màn hình 
			menu.printFirstNotification();
			System.out.println("xin mời chọn\n");
			int x = scanner.nextInt();
			switch(x) {
			case 1: {
				//order món 
				menu.printMenu();
				do {
					System.out.println("xin mời chọn món, nhập 0 để kết thúc!\n");
					choice = scanner.nextInt();
					if(choice ==0||choice<0||choice>menu.getMenu().size()) break;
					else {
						//thêm order vào bill 
						IOrder order = orderFoodFactory.getOrder(choice);
						waiter.addToBill(order);
						numberChosen++;
					}
				}
				while(choice!=0);
				if(numberChosen!=0) waiter.excuteBill();
				else System.out.print("cảm ơn đã tới nhà hàng\n");
				System.out.println("------------------------------");
				break;
				}
			case 2: {
				//xử lí phàn nàn 
				menu.printComplainChoice();
				System.out.println("xin mời chọn\n");
				int complainChoice = scanner.nextInt();
				waiter.handleComplain(complainChoice);
				break;
			}
			default: 
				System.out.println("không hợp lệ");
		}
		}
	}
	
	
}
