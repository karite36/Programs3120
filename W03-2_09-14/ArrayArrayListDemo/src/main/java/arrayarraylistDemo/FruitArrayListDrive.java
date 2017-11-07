package arrayarraylistDemo;

public class FruitArrayListDrive {
	public static void main(String[] args) {
		/* TODO: you are required to implement the 'delete' method in the
		 *       FruitArrayList class. The output of this program upon your
		 *       completion of your program must be as follows,
		 *       
				Showing fruits in the ArrayList:
				fruits[0] = "Apple"
				fruits[1] = "Banana"
				fruits[2] = "Mango"
				Showing fruits after deleting 'Banana' 
				fruits[0] = "Apple"
				fruits[1] = "Mango"
				--------------------------------
				Showing fruits in the ArrayList:
				fruits[0] = "Apple"
				fruits[1] = "Banana"
				fruits[2] = "Mango"
				Showing fruits after deleting 'Mango' 
				fruits[0] = "Apple"
				fruits[1] = "Banana"
				--------------------------------
		 */
		
		/*
		 * TODO: answer the question in a comment. (1)What do you need to make the 
		 *       'delete' method case-insensitive in the FruitArrayList class? 
		 *       (2)You don't need to implement your solution; however, you are
		 *       required to provide at least two solutions, and argue which
		 *       solution is better, and why? 
		 */
		
		/* Response : (1)What we need to make the 'delete' method case insensitive is to take
		 * make the string fruitName uppercase when as it is being added and allow for delete
		 * to take any input of fruitName and make it uppercase so it can find and remove the fruit
		 * from the fruits arraylist. This is shown in FruitArrayList.java under the add and delete 
		 * method. My Response to part (2) of the question is that I find my solution 2 as the better
		 * implementation because it essentially checks for fruitName and wherever it sees it the 
		 * arraylist position gets deleted completely without the hassle of writing such a long method
		 * like solution 1.
		 * 
		 */		
	 	
		// Test Case 1
		testDeleteMiddle();
		// Tests Case 2
		testDeleteLast();
	}
	
	private static void testDeleteMiddle() {
		FruitArrayList fruits = new FruitArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Showing fruits in the ArrayList:");
		fruits.printAll();
		/* note that upper-case 'B' in 'Banana' is intentional. */ 
		System.out.println("Showing fruits after deleting 'Banana' ");
		fruits.delete("Banana");
		fruits.printAll();
		System.out.println("--------------------------------");			
	}
	
	private static void testDeleteLast() {
		FruitArrayList fruits = new FruitArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Showing fruits in the ArrayList:");
		fruits.printAll();
		System.out.println("Showing fruits after deleting 'Mango' ");
		fruits.delete("Mango");
		fruits.printAll();
		System.out.println("--------------------------------");			
	}	

}
