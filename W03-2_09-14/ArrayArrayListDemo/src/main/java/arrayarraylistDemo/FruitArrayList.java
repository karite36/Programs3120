 package arrayarraylistDemo;

//import java.util.Iterator; if I went with Solution #1

import java.util.ArrayList;

/*
 * Wrapper for ArrayList 
 */
public class FruitArrayList {
	ArrayList<String> fruits;
	
	public FruitArrayList() {
		fruits = new ArrayList<String>();
	}
	
	/*REVISED*/
	public void add(String fruitName) {
		fruitName=fruitName.toUpperCase(); // This will add fruitName in Uppercase 
		//so that my delete method can check and change any input into Uppercase
		
		fruits.add(fruitName);
	}
	
	/*REVISED*/	
	public void delete(String fruitName) {
		// TODO: 1. implement this method.
		/* TODO: 2. you may need to consult Java API documentation for the ArrayList class. 
		 *          Write a comment in the code, the method of the ArrayList class you
		 *          look up and the URL to the documentation the method */
		
		/*Soultion 1  from //http://www.geeksforgeeks.org/remove-element-arraylist-java
		 *This is the Iterator remove method
		 *Iterator itr = fruits.iterator();
		 *while (itr.hasNext())
		 *{
		 *	String x = (String)itr.next();
		 * 	if (x==fruitName){
		 * 		itr.remove();
		 * }
		 *}
		 */		
	
		/* ******************************************************* */
		
		/* Soultion 2 from https://stackoverflow.com/questions/10714233
		/remove-item-from-arraylist.*/
		
		fruitName=fruitName.toUpperCase(); //Thx to my add method, delete will take any
		//input of fruitName and change it to UPPERCASE to match what was added previously
		
        	fruits.remove(fruitName); //This is the simple remove method. 
            
	}
	
	public void printAll() {
		for (int i=0; i<fruits.size(); i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits.get(i) + "\"");
		}
	}
}
