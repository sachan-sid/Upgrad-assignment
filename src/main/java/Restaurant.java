import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    
public boolean isRestaurantOpen() {
		int compareOpeningTime = getCurrentTime().compareTo(openingTime);
		int compareClosingTime = closingTime.compareTo(getCurrentTime());
		if (compareOpeningTime > 0 and compareClosingTime > 0){
		   return true;

		} else {
return false;
}

    public LocalTime getCurrentTime()

{ return  LocalTime.now(); }

    public List<Item> getMenu() {

        return menu ;
       
    }

    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
/*
 * This method will calculate prices for all selected items : Code written as part of exercise - 
 *  Part 3: Adding a Feature using TDD (In the stub code, you need to add another method that returns the order value, given the name of the items in <String> format. ) 
 */


public int checkPrice(List<String> selectedItems){
       int totalPrice = 0;
       for(String selectedItem : selectedItems){
	       if (menu.contains(selectedItem){
		       int index = menu.indexOf(selectedItem);
		       Item menuItem= menu.get(index);
			   totalPrice = totalPrice+ menuItem.getPrice();
		   }
	   }
	   return totalPrice;
}

    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }

}
