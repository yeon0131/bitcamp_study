package chap06_method;

import chap06_method_calk.ParameterCalculator;

public class _03_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterCalculator pc = new ParameterCalculator();
		
		//메소드의 사용은 항상 선언된 형태와 동일하게 호출해서 사용한다.
		pc.add(10,20L);
		
		//다른 형태로 호출하게 되면 에러 발생
//		pc.add(10, 20.0); long타입 자리에 double형태가 들어가서 에러 발생
		
		//매개변수 값 전달은 변수로도 가능하다.
		//이 경우에는 변수에 저장된 값이 메소드로 전달된다.
		int num1=100;
		long num2=200L;
		
		pc.add(num1, num2);
		//호출할 때 매개변수의 타입,개수,순서를 동일하게 호출해야 함
		

	}

}
