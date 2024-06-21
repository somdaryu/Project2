package main;

public class Ex4 {

	public static void main(String[] args) {
		
		byte b = 10; // -128 ~ 127까지
		short s = 10;
		int i = 200;
		long l = 10;
		l = 12345678900l; //long타입에는 식별자를 붙여줘야함!
		//int형 범위를 넘어가면 식별자를 붙여야함!
		
		System.out.println(s + b); //서로 다른 타입의 변수끼리 계산 가능
	}

}
