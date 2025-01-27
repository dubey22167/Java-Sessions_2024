package Ajavabasics;

public class TypeCastingConcept {

	public static void main(String[] args) {
		//Java_04_TypeCasting_Widening_Narrowing_Increment_Decrement_Operators.mp4
        //We can only do type cast from small data type to Large:


		//byte, short, char ,integer  long, float and double;
		
		
		//Low to high data type : Widening
		//Byte to Short Conversion:
		byte b = 10;
		short s = b;
		System.out.println(s);//10
		
		
		
		//Higher data type to lower data type : Narrowing
		short s1 =200;
		byte b1 =(byte)s1;
		//-127 to 127 ==>256 
		System.out.println(b1);//-56
		
		short s2 = 10;
		byte b2 = (byte)s2;
		System.out.println(b2);
		
		
		//Widening
		byte t1 =10;
		int i =t1;
		System.out.println(i);
		
		
		//Narrowing //we will loose data hence not used:
		int j = 1000;
		byte k = (byte) j;
		System.out.println(k); //-24
		
		
		//Widening
		int p =100;
		float f =p;
		System.out.println(f);
		
		
		
		
	}

}
