package arrayarraylistDemo;

import org.apache.commons.lang3.ArrayUtils;


public class FruitArray 
{
	private String[] fruits;
	private int size;		// number of fruits stored
	private int capacity;	// maximum number of fruits allowed
	
	public FruitArray(int capacity) {
		fruits = new String[capacity];
		this.capacity = capacity;
		size = 0;
	}	
	
	/*REVISED*/	
	public boolean add(String fruitName) {
		if (size >= capacity) {return false;}
		
		fruitName=fruitName.toUpperCase();	// This will add fruitName in UPPERCASE 
		//so that my delete method can check and change any input into UPPERCASE.
		
		fruits[size] = fruitName;	
		size ++;
		return true;
	}
	
	/*REVISED*/	
	public void delete(String fruitName) {
		// TODO: 1. implement this method.
		/* TODO: 2. you may need to consult Java API documentation for the String class. 
		 *          Write a comment in the code, the method of the String class you
		 *          look up and the URL to the documentation the method 
		 */
	
		fruitName=fruitName.toUpperCase();	//Thx to my add method, delete will take any
		//input of fruitName and change it to UPPERCASE to match what was added previously
		
		fruits = ArrayUtils.removeElement(fruits,fruitName); //Simple remove method.
		//https://stackoverflow.com/questions/642897/removing-an-element-from-an-array-java	 
		size--;   
		
	}
	
	public void printAll() {
		for (int i=0; i<size; i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits[i] + "\"");
		}
	}
}
