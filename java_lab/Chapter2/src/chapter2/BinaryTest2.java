package chapter2;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000000000101; //2진수
		int num2 = 0B11111111111111111111111111111010; //2진수의 1의보수 
		int num3 = 0B00000000000000000000000000000001; //2진수의 1의보수에 1더하면 2의보수 
		int num4 = num2 + num3;
		int num5 = 0B11111111111111111111111111111011; //2진수 2의보수 
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}

}
