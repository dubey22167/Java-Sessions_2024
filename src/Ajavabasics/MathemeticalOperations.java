package Ajavabasics;

public class MathemeticalOperations {

	public static void main(String[] args) {
		// //Java_03_StringDataType_StringConcatenation_ArithmaticOperators.mp4
		
		//Any pure integer value divide zero will error Arithmetic exception:
		
		System.out.println(1+2);//3
		
		System.out.println(10/2);//5
		
		System.out.println(9/2);//4  // It will print integer value only not floating (4.5)..Pure integer concept
		
		System.err.println(9.0/2);//4.5
		
		System.out.println(9/2.0);//4.5
		
		System.out.println(9.0/2.0);//4.5
		
		//System.out.println(9/0);//Exception :ArithmeticException/ by zero.*************************
		
		System.out.println(0/9);//0
		
		System.out.println(9.0/0);//Infinity
		
	    System.out.println(9/0.0);//Infinity ***********************************
	    
	    System.out.println(9.0/0.0);//Infinity  ==It will apply on double and floating data types.
        
	   //System.out.println(0/0);//Exception in thread "main" java.lang.ArithmeticException
	    
	   //System.out.println(-1/0);//ArithmeticException: / by zero
	    
	    System.out.println(2/9);//0
	    
	    System.out.println(0.0/0.0);//NaN  : not a number :*********************
	    System.out.println(0.0/0.);//NaN
	    System.out.println(0./0.0);//NaN
	    //System.out.println(-12/0);//ArithmeticException
	    
	    System.out.println(0/9.0);//0.0
	    //*****************************************************************************************************
	    //Modules operator ..
	    System.out.println(10 % 2);// 0
	    System.out.println(9 % 2);//1
	    System.out.println(100 %3);//1  
	    
	    //System.out.println(9%0); //ArithmeticException: / by zero
	    System.out.println(0%9);//0
	}

}
