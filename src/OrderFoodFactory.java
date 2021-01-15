
public class OrderFoodFactory {
	
	ManageChef manage;
	public OrderFoodFactory(ManageChef manage) {
		this.manage = manage;
	}
	public IOrder getOrder(int index) {
		switch(index) {
		case 1: return new OrderCake(manage.getRandomChefCanMake(index)); 
		case 2: return new OrderCream(manage.getRandomChefCanMake(index)); 
		case 3: return new OrderMilktea(manage.getRandomChefCanMake(index)); 
		case 4: return new OrderCoffee(manage.getRandomChefCanMake(index)); 
		case 5: return new OrderSoda(manage.getRandomChefCanMake(index)); 
		case 6: return new OrderJuice(manage.getRandomChefCanMake(index)); 
		case 7: return new OrderMeat(manage.getRandomChefCanMake(index)); 
		case 8: return new OrderHamberger(manage.getRandomChefCanMake(index)); 
		case 9: return new OrderChicken(manage.getRandomChefCanMake(index)); 
		case 10: return new OrderNoodles(manage.getRandomChefCanMake(index)); 
		default: return null;
		}
	}
	
}
