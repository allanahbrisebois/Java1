

package Math;


public class Arithmetic2 {
    public static void main(String[] args) {
		 int sum = 10;
		 int inc = 2;
		 sum += inc; //12
		 System.out.println(sum + ", " + inc);
		 sum++; //13
		 System.out.println(sum + ", " + inc);
		 sum += inc++; // 13 + 2 = 15
		 
		 System.out.println(sum + ", " + inc);
	 }
}
