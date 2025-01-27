package Ajavabasics;

public class StringConcatenation {

	public static void main(String[] args) {
		//Java_03_StringDataType_StringConcatenation_ArithmaticOperators.mp4
		//Concatenation means merge.
		//String is a class: default class
		//class name should start with capital letter
		// + sign with string will work as merge(Concatenation) and always start from left to right
		//String can be concatenated with any data types
		//****************************************************************************************************

		
		String name ="Naveen";
		String num = "1000";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double c =12.33;
		double d =12.44;
		
		System.out.println(a+b);//300
		System.out.println(x+y); //HelloSelenium
		System.out.println(x+a); //Hello100
		System.out.println(a+b+x);//300Hello
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
	    System.out.println(x+y+(a+b));//HelloSelenium300
	    System.out.println(a+b+x+y+a+b+c+d);//300HelloSelenium10020012.3312.44
	    System.out.println(a+b+x+y+(a+b+c+d));//300HelloSelenium32.77
	    System.out.println(a+b+c+d+x+y); //324.77HelloSelenium
	    
	    System.out.println("the value of a is " +a);
	    System.out.println("the value of b is " +b);
	    System.out.println("the value of a and b is " + a+b);//the value of a and b is 100200

	    System.out.println("the value of a and b is :" + (a+b)); //the value of a and b is :300

		//****************************************************************************************************


	    //Char : Every char has ASSCII value:
	    char ch = 'a';
	    String str = "Selenium";
	    System.out.println(ch+str);//aSelenium
	    
	    
	    
	    
	    char c1 = 'a';
	    char c2 = 'b';
	    System.out.println(c1+c2); //195 :it will be consider as numeric family and ASCII value will be added.
	    
	    
	    //for boolean we can do concatenation but it is not usefull.
	    
	    
	    

		
		
		
		
		
		
		
		


	}

}
