package PassByValueDemo;

public class PassByValueDemoReferenceTestDrive {
	public static void main(String[] args) {
		// TODO: 1. complete the class using the code in slide 6 of lecture C04
		/* TODO: 2. run the two Java programs, and observe the result, and explain the 
		 *          learning objective of this exercise the instructor has in mind. Write
		 *          the explanation as a comment in this program.
		 */	
		PassByValueDemoReference demo = new PassByValueDemoReference(); 
		int[] x = {3}; 
		System.out.println("main: before calling changeX: x[0] = " + x[0]); 
		demo.changeX(x); 
		System.out.println("main: after calling changeX: x[0] = " + x[0]); 
	}
	
	/*After observing the the resulting output after running the two java programs
	 *the learning objective seems clear: by reminding us about Reference 
	 *parameters us programmers can create a better styled program that can one
	 *change the value of an actual parameter variable in a function call  while
	 *at the same time allow for the function itself to return statements if allowed
	 *allowing for multiple changes that are needed to proceed in a particular program */

	
}

