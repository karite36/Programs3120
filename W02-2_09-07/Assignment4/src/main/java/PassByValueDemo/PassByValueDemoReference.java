package PassByValueDemo;

public class PassByValueDemoReference {
	// TODO: complete the class using the code in slide 6 of lecture C04
	
	void changeX(int[] x){ 
		System.out.println("changeX: at beginning: x[0] = " + x[0]); 
		x[0] = 2; 
		System.out.println("changeX: at the end: x[0] = " + x[0]); 
	}
}
