package Ajavabasics;

public class DataTypesConcept {

	public static void main(String[] args) {
		//:-2024 Java sessions: Java_02_DataTypes_Range_Size_PrimitiveDataTypes.mp4

		//****************************************************************************************************
		//A: Data Types
		//**1.primitive data types 
		
		//Numeric Type:
		    //integral value 
		              //integer : byte, short, int and long
		              //floating: float and double 
		   //character: char : $ 1 a
	   //boolean type : true , false
		
		
	   //**2.non primitive data types: class , interface,arrays AND object
		
		
		//****************************************************************************************************
		//1. byte: staring with small letter is called "Keyword" in java.
		byte b = 10;
		//byte b = 20;  Can create duplicate variable "b" in java
		//size: 1 byte = 8bits
		//range:-128 to 127 (2^7 to 2^7-1)
		b=20;
		System.out.println(b);
		byte c = 100;
		byte c1 = -20;
		//byte c1 = 130;
		//byte c2= -130; We can use this to store  variable value to  127 to -128:
		System.out.println(c);
		System.out.println(c1);
		
		
		//****************************************************************************************************
		//2.shorts
		//size: 2 byte == 16 bits
		//range: -32768 to 32767 (2^15 to 2^15-1)
	    short sh = 600;
	    short sh1 = 120;
	    System.out.println(sh);
	    System.out.println(sh1);
	    
	    
	    //****************************************************************************************************
	    //3.Integer:
	    //size:4 bytes = 4*8 = 32 bits
	    //range: -2147483648 to 2147483647 (2^31 to 2^31-1)
	    
	    int i = 10000;
	    int j =1; //4bytes
	    System.out.println(i);
	    System.out.println(j);
	    
	    
	    //****************************************************************************************************
	    //4.long
	    //size: 8*8 =64bits
	    //range: (2^63 to 2^63-1)
	    long num = 18523694744555L; //for large value put L in value:
	    System.out.println(num);
	    System.out.println(num); // We can use for population, earth distance,sun
	    
	    //mobile, ssn ,adhar,card number, account ,this will store in string.
	    
	    
	    //****************************************************************************************************
	    //5.float : it will store decimal value:
	    //size: 4 bytes = 4*8 = 32bits
	    //range: after dot . it can take upto 6-7 digits and before dot 39Digits
	    float f = 12.33f; //Write F in float value:
	    float f1 = (float)12.33;
	    System.out.println(f);
	    System.out.println(f1);
	    float f2 =100;
	    System.out.println(f2);
	    
	    
	    //****************************************************************************************************
	    //6.double:
	    //size: 8 bytes = 64 bits
	    //range: it can take upto 15 decimal digits before dots and after dot 309 digits
	    double de  =12.33;
	    System.out.println(de);
	    
	    double df = 125; // can store pure numeric value but it will print 125.0
	    System.out.println(df);
	    
	    
	    
	    //****************************************************************************************************
	    //7.char: it can only take 1 digit value:unicode values +ASCII values
	    //size: 2 bytes = 16 bits
	    char ch ='a';
	    System.out.println(ch);
	    char ch1 = '%';
	    System.out.println(ch1);
	    
	    char gender = 'M';
	    System.out.println(gender);
	    
	    char ch2 = 123; //it will store cz it come from numeric family.
	    System.out.println(ch2);
	    
	    
	    //****************************************************************************************************
	    //8.boolean: 
	    //size: ~1  bit
	    //range: true or false:
	    
	    boolean bl  = true;
	    boolean b2  = false;
	    System.out.println(bl);
	    System.out.println(b2);
	    
		
		
		
		

	}

}
