
public class Manager extends HandleComplain {
	//quản lí duy nhất 
	//sử dụng singleton 
	private static Manager manager;
	public static Manager getInstance() {
		if(manager ==null) {
			manager= new Manager();
		}
		return manager;
	}
	
	@Override
	public void handleComplain(int level) {
		if(level==2) {
			System.out.print("quản lí: thành thật xin lỗi quý khách!\n");
		}else if(this.nextHandleComplain!=null) {
			this.nextHandleComplain.handleComplain(level);
		}
	}
}
