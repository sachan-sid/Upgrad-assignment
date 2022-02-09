public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }


/*
 * This method will return the price of selected item : Code written as part of exercise 
 *  Part 3: Adding a Feature using TDD (In the stub code, you need to add another method that returns the order value, given the name of the items in <String> format. ) 
 */
public int getPrice() 
{
        return price;
}
