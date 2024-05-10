package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 까지 곱한 값을 구하세요.(100 팩토리얼, 100!)
		// Long 타입으로는 표현 불가
		BigInteger bigInt = new BigInteger("1");
//		for(int i=0; i<100; i++) {
		//위 코드로 실행하면 i값이 0부터 들어가면서 0이 곱해짐. 틀린 답.
		for(int i=1; i<=100; i++) {
			bigInt=bigInt.multiply(BigInteger.valueOf(i));	
		}	
		System.out.println("1~100 까지 곱한 값: "+bigInt);
		
		//10까지의 곱
		long num = factorial(10);
		System.out.println(num);
		
		//100!
		System.out.println(factorialBigInteger(BigInteger.valueOf(100)));
		
		//1!=1
		//2!=2
		//...
		//100!=...이 출력되도록 구현하시오.
		for(int i=1;i<=100;i++) {
			System.out.println(i+"!값: "+factorialBigInteger(BigInteger.valueOf(i)));
		}
	}
	
	public static long factorial(long num) {
		if(num==0) {
			return 1;
		}else {
			//재귀메소드: 현재 메소드를 구현부안에서 호출
			//num=10이 들어오면
			//10*factorial(9)
			//10*9*factorial(8)
			//10*9*8*factorial(7)
			//...
			////10*9*8*7*...*factorial(0)
			return num*factorial(num-1);
		}
	}
	// 위 메소드를 변환
	public static BigInteger factorialBigInteger(BigInteger bigInt) {
		if(bigInt.intValue()==0) {
			return BigInteger.valueOf(1);
//			return BigInteger.ONE;
//			return new BigInteger("1");
		}else {
			return bigInt.multiply(factorialBigInteger(bigInt.subtract(BigInteger.ONE)));
		}
	}

}
