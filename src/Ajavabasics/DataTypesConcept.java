package Ajavabasics;

public class DataTypesConcept {

	public static void main(String[] args) {
		//:-2024 Java sessions: Java_02_DataTypes_Range_Size_PrimitiveDataTypes.mp4

		
		//A: Data Types
		//**1.primitive data types 
		
		//Numeric Type:
		    //integral value 
		              //integer : byte, short, int and long
		              //floating: float and double c1
		   //character: char : $ 1 a
	   //boolean type : true , false
		
	   //**2.non primitive data types: class , interface,arrays AND object
		
		
		
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
		
		
		
		//2.shorts
		//size: 2 byte == 16 bits
		//range: -32768 to 32767 (2^15 to 2^15-1)
	    short sh = 600;
	    short sh1 = 120;
	    System.out.println(sh);
	    System.out.println(sh1);
	    
	    //3.Integer:
	    //size:4 bytes = 4*8 = 32 bits
	    //range: -2147483648 to 2147483647 (2^31 to 2^31-1)
	    
	    int i = 10000;
	    int j =1; //4bytes
	    System.out.println(i);
	    System.out.println(j);
	    
	    
	    //4.long
	    //size: 8*8 =64bits
	    //range: (2^63 to 2^63-1)
	    
	    long l = 18523694744555L;
	    System.out.println(l);
	    
	    System.out.println(l);
	    
		
		
		
		

	}

}
