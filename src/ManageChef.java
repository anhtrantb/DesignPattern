import java.util.ArrayList;
import java.util.Random;

public class ManageChef {
//lớp quản lí nhà hàng, chứa mọi nhân viên trong nhà hàng 
	ArrayList<Chef> listChef = new ArrayList<Chef>();
	public ManageChef() {
		// TODO Auto-generated constructor stub
	}
	//thêm đầu bếp 
	public void addChef(Chef chef) {
		this.listChef.add(chef);
	}
	//
	public ArrayList<Chef> getlistChefCanMake(int index) {
		ArrayList<Chef> listChefCanMake = new ArrayList<>();
		for(Chef chef: listChef) {
			if(chef.getCanMake().contains(index)) {
				listChefCanMake.add(chef);
			}
		}
		return listChefCanMake;
	}
	public Chef getRandomChefCanMake(int index){
		Random random = new Random();
		ArrayList<Chef> listChefCanMake = getlistChefCanMake(index);
		int x = random.nextInt(listChefCanMake.size());
		return listChefCanMake.get(x);
	}
}
