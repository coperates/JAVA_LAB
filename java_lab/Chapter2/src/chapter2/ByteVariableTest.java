package chapter2;

public class ByteVariableTest {

	public static void main(String[] args) {
		
		byte bDate = -128;
		
		System.out.println(bDate);
		
		byte bDate2 = 127; //byte는 1바이트의 크기이기 때문에 2의7승(-1) 까지 표현가능 
		//127 이상의 값 접근시 에러발생 
		
		System.out.println(bDate2);
		
	}

}
