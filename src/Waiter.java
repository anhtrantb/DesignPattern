import java.util.ArrayList;

public class Waiter extends HandleComplain implements IObserver{
	//mỗi một phục vụ có 1 hóa đơn để lên món 
	ArrayList<IOrder> bill = new ArrayList<>();
	//số lượng món đã thêm vào bill
	public void addToBill(IOrder order) {
		//thêm hóa đơn 
		bill.add(order);
	}
	public void excuteBill() {
		System.out.print("phục vụ đã mang yêu cầu gửi cho nhà bếp \n");
		//thực hiện toàn bộ hóa đơn 
		for(IOrder order : bill) {
			order.execute();
		}
		//xóa toàn bộ hóa đơn đã làm xong
		bill.clear();
	}
	@Override
	public void update(boolean status) {
		if(status == true) {
			System.out.print("phục vụ mang đồ ăn ra cho khách !\n");
		}else  {
			System.out.print("phục vụ xin lỗi khách vì không thực hiện được món ăn! \n");
		}
		System.out.print("-->> \n");
	}
	@Override
	public void handleComplain(int level) {
		if(level==1) {
			System.out.print("phục vụ: thành thật xin lỗi quý khách!\n");
		}else if(this.nextHandleComplain!=null) {
			this.nextHandleComplain.handleComplain(level);
		}
		
	}
	
}
