

package Basics;


public class DataTypes {
    public static void main(String[] args) {
		int age = 23;  // 4 bytes -> 32 bits -> Range: -2,147,438,648 to 2,147,438,647
		
		float percent = 4.3f;   //4 bytes - 32 bits
		short s = 4; // 2 bytes -> 16 bits -> range -32768 to 32767
		byte n = 34;
		int y = (int)3.6;  //Type casting - gets rid of decimal
		double abc = age*percent;  //8 bytes
		String k = "That's pretty neat";
		
		System.out.println(age);
		System.out.println(abc);
		System.out.println(k);
		System.out.println(y);
	}
}
