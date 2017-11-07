package arrayarrayListTest;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

//TODO: 1. Add a test class FruitArrayListTest.java, and design and implement 
//         a few tests for the delete method in the FruitArrayList class. When
//         designing your test cases, consider test coverage and the quality
//         of the both of the code under test and testing code.

public class FruitArrayListTest {
	@Test
    public void testDeleteByDeletingOneString() {
		FruitArrayList fruits = new FruitArrayList();	
		ArrayList<String> fruitsExpected= new ArrayList<String>();
		
		fruits.add("Apple"); fruits.add("Banana");fruits.add("Mango");
		fruitsExpected.add("Banana");fruitsExpected.add("Mango");			
		
		fruits.delete("Apple");		
		
		
		assertEquals("The size of the Fruits ArrayList object is unexpected.", fruitsExpected.size(), fruits.getSize() );
        assertEquals(fruits.getSize()+1, 3 );
        
        assertTrue(!fruits.contains("Apple"));		
    }
	
	@Test
	public void testDeleteByDeletingMultipleStrings() {
		FruitArrayList fruits = new FruitArrayList();	
		ArrayList<String> fruitsExpected= new ArrayList<String>();
		
		fruits.add("Apple"); fruits.add("Banana");fruits.add("Mango");
		fruitsExpected.add("Apple");			
		
		fruits.delete("Banana");fruits.delete("Mango");		
		
		
		assertEquals("The size of the Fruits ArrayList object is unexpected.", fruitsExpected.size(), fruits.getSize() );
        assertEquals(fruits.getSize()+2, 3 );
        
        assertTrue(!fruits.contains("Apple"));		
    }
	
	@Test	
	public void testDeleteByDeletingUpperCaseString() {
		FruitArrayList fruits = new FruitArrayList();	
		ArrayList<String> fruitsExpected= new ArrayList<String>();
		
		fruits.add("Apple"); fruits.add("Banana");fruits.add("Mango");
		fruitsExpected.add("Banana");fruitsExpected.add("Mango");			
		
		fruits.delete("APPLE");		
		
		
		assertEquals("The size of the Fruits ArrayList object is unexpected.", fruitsExpected.size(), fruits.getSize() );
        assertEquals(fruits.getSize()+1, 3 );
        
        assertTrue(!fruits.contains("Apple"));		
    }	
}
	