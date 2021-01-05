import java.util.Date;
import java.util.ArrayList;
public class GroceryStore {
	
	public ArrayList<FoodStuff> getExpiredFoodStuff(){
		Date date = new Date();
		FoodStuff food1 = new FoodStuff();
		ArrayList<FoodStuff> expiredFood = new ArrayList<FoodStuff>();
		if(food1.getExpirationDate().after(date)) {
			expiredFood.add(food1);
		}
		return expiredFood;
	}
	

}
