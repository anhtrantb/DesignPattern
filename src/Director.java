
public class Director extends HandleComplain {
	//một giám đốc duy nhất 
	private static Director director;
	public static Director getInstance() {
		if(director ==null) {
			director = new Director();
		}
		return director;
	}
	@Override
	public void handleComplain(int level) {
		if(level==3) {
			System.out.print("gíam đốc: thành thật xin lỗi quý khách!\n");
		}else if(this.nextHandleComplain!=null) {
			this.nextHandleComplain.handleComplain(level);
		}
	}
}
