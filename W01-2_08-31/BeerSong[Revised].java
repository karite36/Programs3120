/**
 *   Name: BeerSong[Revised].java
     Author:Faustino Malena
     Description:This is a revision of a copy of BeerSong.java
     for when the bottles of beers is odd, the rhyme reflects you 
     taking two bottles of beers down instead of one.
*/

public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        int takeaway=2;
        String word = "bottles";
        String phrase1= "Take two down";
        String phrase2= "Pass them around";
        
        while (beerNum > 0 ) {
            
            if((beerNum%2==0)|| (beerNum ==1)){// if the number of beers is even or equal 1
                if (beerNum ==1) {
                    word = "bottle";
                }
                phrase1= "Take one down";
                phrase2= "Pass it around";
                takeaway=1;
            }
            
            else {// if the number of beers is odd
                   phrase1= "Take two down";
                   phrase2= "Pass them around";
                   takeaway=2;
            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println(phrase1);
            System.out.println(phrase2);
            beerNum=beerNum-takeaway;
           
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            } // end else
        } // end while loop
    } // end main method
} // end class
