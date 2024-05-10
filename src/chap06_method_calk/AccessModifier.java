package chap06_method_calk;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//같은 패키지안에 선언된 클래스는 import구문이 필요없음
		AccessModifierCalculator ac = new AccessModifierCalculator();
		
		//같은 패키지안의 클래스에서는 public, protected, default 접근 제어자로 
		//선언된 메소드를 사용할 수 있다.
		ac.add();
		ac.sub();
		ac.mul();
		//private 메소드는 다른 클래스에서는 사용할 수 없음.
//		ac.div();

	}

}
