package chap07_class.circle;

public class Circle {
	public final double PI = 3.14; 	//상수는 final로 맹들어야 됨, 선언과 동시에 초기화
	public int radius;
	
	public Circle(){				//기본생성자
	}
	
	public Circle(int putNum){		//int값을 받아서 radius를 초기화시키는 생성자
		this.radius = putNum;		//생성자를 호출하면 객체가 생성되는데 this는 생성된 객체를 받아옴.
	}
	
	public double roundCalc1() {	//원의 둘레를 계산하는 메소드
		return 2*PI*radius;
	}
	
	public double roundCalc2() {	//원의 넓이를 계산하는 메소드
		return PI*radius*radius;
	}
	

}
