package week2;
public class Calculator {

	
	     public int add(int a,int b) {
	    	 return a+b;
	     }
	     public int divide(int a,int b) {
	    	 if(b==0) throw new IllegalArgumentException("Division by zero");
	    	 return a/b;
	  }
	     public int square(int a) {
	    	 return a*a;
	    	 
	     }
	

}
