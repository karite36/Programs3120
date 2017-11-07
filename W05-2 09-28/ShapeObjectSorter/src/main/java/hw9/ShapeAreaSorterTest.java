package hw9;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ShapeAreaSorterTest {
	
		@Test 
		public void testShapeSorterByAreaOfCircles () { 
			
			ArrayList<Shape> shapeList = new ArrayList<Shape >() ; 
			shapeList.add(new Circle ("Circle 1" , 6.0) ) ; 
			shapeList.add(new Circle ("Circle 2" , 2.0) ) ; 
			shapeList.add(new Circle ("Circle 3" , 4.0) ) ; 
			
			shapeList.sort(new ShapeAreaComparator () ) ; 		

			ArrayList<Shape> expectedShapeList = new ArrayList<Shape >() ; 
			expectedShapeList. add(new Circle ("Circle 2" , 2.0) ) ;
			expectedShapeList. add(new Circle ("Circle 3" , 4.0) ) ;
			expectedShapeList. add(new Circle ("Circle 1" , 6.0) ) ;	
			
		 
			assertEquals( expectedShapeList , shapeList ) ;	 
		}
		
		@Test 
		public void testShapeSorterByAreaOfRectangles() { 
			
			ArrayList<Shape> shapeList = new ArrayList<Shape >() ; 
			shapeList. add(new Rectangle ("Rectangle 1" , 75.5 , 65.5) ) ; 
			shapeList. add(new Rectangle ("Rectangle 2" , 10.1 , 20.2) ) ; 
			shapeList. add(new Rectangle ("Rectangle 3" , 40.0 , 25.5) ) ; 
			
			shapeList.sort(new ShapeAreaComparator () ) ; 		

			ArrayList<Shape> expectedShapeList = new ArrayList<Shape >() ; 
			expectedShapeList. add(new Rectangle ("Rectangle 2" , 10.1 , 20.2) ) ; 
			expectedShapeList. add(new Rectangle ("Rectangle 3" , 40.0 , 25.5) ) ;
			expectedShapeList. add(new Rectangle ("Rectangle 1" , 75.5 , 65.5) ) ; 	
			
		 
			assertEquals( expectedShapeList , shapeList ) ;	 
		}
		
		@Test 
		public void testShapeSorterByAreaOfCirclesAndRectangles () { 
			
			ArrayList<Shape> shapeList = new ArrayList<Shape >() ; 
			shapeList.add(new Circle ("Circle 1" , 6.0) ) ; 
			shapeList.add(new Circle ("Circle 2" , 2.0) ) ; 
			shapeList.add(new Circle ("Circle 3" , 4.0) ) ;
			shapeList. add(new Rectangle ("Rectangle 1" , 75.5 , 65.5) ) ; 
			shapeList. add(new Rectangle ("Rectangle 2" , 10.1 , 20.2) ) ; 
			shapeList. add(new Rectangle ("Rectangle 3" , 40.0 , 25.5) ) ; 
            
			
			shapeList.sort(new ShapeAreaComparator () ) ; 		

			ArrayList<Shape> expectedShapeList = new ArrayList<Shape >() ; 
			expectedShapeList. add(new Circle ("Circle 2" , 2.0) ) ;
			expectedShapeList. add(new Circle ("Circle 3" , 4.0) ) ;
			expectedShapeList. add(new Circle ("Circle 1" , 6.0) ) ;
			expectedShapeList. add(new Rectangle ("Rectangle 2" , 10.1 , 20.2) ) ; 
			expectedShapeList. add(new Rectangle ("Rectangle 3" , 40.0 , 25.5) ) ;
			expectedShapeList. add(new Rectangle ("Rectangle 1" , 75.5 , 65.5) ) ; 
			
		 
			assertEquals( expectedShapeList , shapeList ) ;	 
		}
		
		
		
		

}


