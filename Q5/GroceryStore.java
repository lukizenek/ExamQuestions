import java.util.Date;
import java.util.ArrayList;
public class GroceryStore {
	ArrayList<FoodStuff> foodStuff = new ArrayList<FoodStuff>();
	
	public ArrayList<FoodStuff> getExpiredFoodStuff(){ // this method should have argument in form of foodstuff object
		Date date = new Date();
		ArrayList<FoodStuff> expiredFood = new ArrayList<FoodStuff>();
		for(int i = 0; i < foodStuff.size(); i++) {
			if(date.after(foodStuff.get(i).getExpirationDate())) {
				expiredFood.add(foodStuff.get(i));
			}
		}
		return expiredFood;
		
	}
	

}
