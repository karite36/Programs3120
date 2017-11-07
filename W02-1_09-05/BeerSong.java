/** 
 * To compile it from the Command Line: 
 *     javac BeerSong.java 
 * To run it from the Command Line: 
 *     java BeerSong 
 */ 
 public class BeerSong { 
     public static void main (String[] args) { 
        int beerNum = 99; 
        int takeDownNum = 1;  
 
 
        /*  
         * add command line arguments to set starting bottles of 
         * beer and the bottles of beer to take down. However, this 
         * revision introduces two bugs to the program. What are they? 
         * */ 
        
		if (args.length == 1) { 
            beerNum = Integer.parseInt(args[0]); 
       } else if (args.length >= 2 && (!(Integer.parseInt(args[0])<Integer.parseInt(args[1])))) { 
           beerNum = Integer.parseInt(args[0]); 
            takeDownNum = Integer.parseInt(args[1]); 
        } 
		/*  The FIRST BUG in the program comes from the line 21 which causes a negative result
		within the beerSong rhyme when the second array element is greater then first array element
		, this revision fixes this bug by placing a condition to not run with  set of elements like that
		*/

 
        String word = "bottles"; 
         
        while (beerNum > 0 ) { 
            if (beerNum ==1) { 
                word = "bottle"; 
            } 
             
            System.out.println(beerNum + " " + word + " of beer on the wall"); 
            System.out.println(beerNum + " " + word + " of beer."); 
			
            System.out.println("Take " + takeDownNum + " down.");
			/* The original phrase of line 41 "Take one down" contradicts the actual number of beer bottles
			actually being taken down on line 47 on certain instances, making this the SECOND BUG
			in the program. This revision should fix this bug*/ 
            
			System.out.println("Pass it around."); 
            beerNum -= takeDownNum; 
             
            if (beerNum > 0) { 
                System.out.println(beerNum + " " + word + " of beer on the wall"); 
            } else { 
                System.out.println("No more bottles of beer on the wall."); 
            } // end else 
        } // end while loop 
    } // end main method 
} // end class 
