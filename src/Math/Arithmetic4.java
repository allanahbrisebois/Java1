package Math;


public class Arithmetic4 {
    public static void main(String[] args) {
		int num = 0; 
		int factor = 3;
		num+=factor; //3
		System.out.println(num);//3
		num++; //4
		System.out.println(num/2); //2
		int result = num +--factor; //6
		System.out.println(result);//6
		result +=num++-factor; // 6 + 5 -3
		System.out.println(result); //8	
	}
}
