package chap06_method;

import chap06_method_calk.AccessModifierCalculator;

public class AccessModifierCalculatorChild extends AccessModifierCalculator{ //extends: 상속받을 때 쓰는 키워드
	public void print() {
		//상속받은 클래스에서 상속해준 클래스를 호출할 때는 super이라는 키워드를 사용한다.
		//상속받은 자식 클래스에서는 public, protected 메소드 사용가능
		super.add();
		super.sub();
		
	}
	
	

}
