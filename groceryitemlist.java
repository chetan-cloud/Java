package Assignments;

public class groceryitemlist 
{

	public static void main(String[] args) 
	{
		GroceryList2 myList = new GroceryList2();
		GroceryItemOrder2 item1 = new GroceryItemOrder2("rice", 4, 9.95);
		GroceryItemOrder2 item2 = new GroceryItemOrder2("pizza", 2, 11.95);
		GroceryItemOrder2 item3 = new GroceryItemOrder2("fish", 1, 7.95);
		GroceryItemOrder2 item4 = new GroceryItemOrder2("wheat", 1, 5.95);
		myList.add(item1);
		myList.add(item2);
		myList.add(item3);
		myList.add(item4);
		myList.displayItems();
		System.out.println("Total = " + myList.getTotalCost());

	}

}
