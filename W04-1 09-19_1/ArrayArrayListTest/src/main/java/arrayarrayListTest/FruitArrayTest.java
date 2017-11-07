package arrayarrayListTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 * API documentation: http://junit.org/junit4/javadoc/latest/index.html
 * Example: https://github.com/junit-team/junit4/wiki/getting-started
 */

public class FruitArrayTest
{	 
	//TODO: 1. Has been answered in FruitArrayListTest.java
	
	/*TODO: 2. Has been answered in two parts, part 1 is in  FruitArray.java and part 2 is in
	 *         FruitArrayList.java
	 */
	           
	/*TODO: 3. Explain why I gave up the idea of using assertArrayEquals. It seems to
	 *         be simpler if I used it. Write your explanation as a comment in this 
	 *         Java file. 
	 */ 
	
	/* Response to TODO 3: Maybe assertArrayEquals would be unreliable when comparing
	 * two arrays because maybe the method doesn't care about the order in which
	 * the elements of the two arrays are given.Say we have:
	 * 
	 *   int[] arr1={1,2,3}
	 *   int [] arr2={2,3,1}
	 *   
	 *   maybe the method assertArrayEquals would find both arr1 and arr2 equal
	 *   because they have the same elements but in different order.
	 *   
	 *    This is just all of my speculations as to why you would give up the 
	 *    assertArrayEquals method in JUnit testing.
	 */
	 
	 
	
    /* Test the delete method thoroughly  */
	@Test
    public void testDeleteByDeleting1st() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArray fruitArray = new FruitArray(fruits);    

        fruitArray.delete(new String("Apple"));
        String[] fruitsExpected = {new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        
        assertEquals("The size of the FruitArray object is unexpected.", fruitArray.getSize(), fruitsExpected.length);
        assertEquals(fruitArray.getCapacity(), fruitsExpected.length + 1);
        // why not assertArrayEquals( ... )
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArray.getFruitsAsArray()[i].equals(fruitsExpected[i]));
		}
    }

	@Test
    public void testDeleteByDeleting3rd() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArray fruitArray = new FruitArray(fruits);    
        
        fruitArray.delete(new String("Kiwi"));
        String[] fruitsExpected = {new String("Apple"), new String("Banana"), new String("Mango"), new String("Orange")};

        assertEquals("The size of the FruitArray object is unexpected.", fruitArray.getSize(), fruitsExpected.length);
        assertEquals(fruitArray.getCapacity(), fruitsExpected.length + 1);
        // why not assertArrayEquals( ... )
        for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArray.getFruitsAsArray()[i].equals(fruitsExpected[i]));
		}
    }  

	@Test
    public void testDeleteByDeletingLast() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArray fruitArray = new FruitArray(fruits);    
        
        fruitArray.delete(new String("Orange"));
        String[] fruitsExpected = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango")};
        
        assertEquals("The size of the FruitArray object is unexpected.", fruitArray.getSize(), fruitsExpected.length);
        assertEquals(fruitArray.getCapacity(), fruitsExpected.length + 1);
        // why not assertArrayEquals( ... )        
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArray.getFruitsAsArray()[i].equals(fruitsExpected[i]));
		}
    } 
    
	@Test
    public void testDeleteIgnoreCaseByDeleting1st() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArray fruitArray = new FruitArray(fruits);    
        
        fruitArray.delete(new String("apple"));
        String[] fruitsExpected = {new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};

        assertEquals("The size of the FruitArray object is unexpected.", fruitArray.getSize(), fruitsExpected.length);
        assertEquals(fruitArray.getCapacity(), fruitsExpected.length + 1);
        // why not assertArrayEquals( ... )        
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArray.getFruitsAsArray()[i].equals(fruitsExpected[i]));
		}
    }


	@Test
    public void testDeleteIgnoreCaseByDeletingLast() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArray fruitArray = new FruitArray(fruits);    
        
        fruitArray.delete(new String("orangE"));
        String[] fruitsExpected = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango")};

        
        assertEquals("The size of the FruitArray object is unexpected.", fruitArray.getSize(), fruitsExpected.length);
        assertEquals(fruitArray.getCapacity(), fruitsExpected.length + 1);
        // why not assertArrayEquals( ... )        
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArray.getFruitsAsArray()[i].equals(fruitsExpected[i]));
		}
    }     
    
}
