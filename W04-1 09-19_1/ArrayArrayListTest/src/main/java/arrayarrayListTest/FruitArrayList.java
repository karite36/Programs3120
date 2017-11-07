package arrayarrayListTest;

import java.util.ArrayList;

//TODO: 2 Part II. If your code does not pass the tests, fix your code. Explain the bugs
	//          found in a comment in both FruitArray.java and FruitArrayList.java. 
	//          If you do not find any bugs, you still need to write a comment in both
	//          FruitArray.java and FruitArrayList.java, and the comment reads, "no 
	//          bugs found" or similar.	 

/*Response to TODO 2  Part II:There were bugs in this FruitArrayList.java file and 
 * the bug was that i couldn't call .size() for fruits when i needed to compare
 * the fruits size to another Array List due to it being an object. This file was
 * missing a method to return a size for fruits object so I decided to make one
 * and after that I had to make a contains method to make sure deletion was a 
 * success when testing the FruitArrayList java program.
 */
 

public class FruitArrayList {
	ArrayList<String> fruits;
	
	public FruitArrayList() {
		fruits = new ArrayList<String>();
	}
	
	
	public void add(String fruitName) {
		
		fruitName=fruitName.toLowerCase(); //Thx to my add method, delete will take any
		//input of fruitName and change it to UPPERCASE to match what was added previously		
		fruits.add(fruitName);
	}
	
	public int getSize() {
		return fruits.size();
	}
	
	public boolean contains (String fruitName){
		return fruits.contains(fruitName);		
	}
	
	public void delete(String fruitName) {
		// TODO: 1. implement this method.
		/* TODO: 2. you may need to consult Java API documentation for the ArrayList class. 
		 *          Write a comment in the code, the method of the ArrayList class you
		 *          look up and the URL to the documentation the method 
		 */
		
		/* Soultion 2 from https://stackoverflow.com/questions/10714233
		/remove-item-from-arraylist.*/
		
		fruitName=fruitName.toLowerCase(); //Thx to my add method, delete will take any
		//input of fruitName and change it to UPPERCASE to match what was added previously
		
        fruits.remove(fruitName); //This is the simple remove method. 
}
	
	
	public void printAll() {
		for (int i=0; i<fruits.size(); i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits.get(i) + "\"");
		}
	}	
		
	
}
