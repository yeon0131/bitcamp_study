package chap14_objectarray;

import chap14_objectarray.car.CarInterface;
import chap14_objectarray.car.HuyndaiCar;
import chap14_objectarray.car.KiaCar;

public class _02_InterfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 인터페이스 배열 선언
		// 모든 요소가 null인 상태로 배열이 생성된다.
		CarInterface[] carInterfaceArr = new CarInterface[100];
		
		// 2. 인터페이스 배열에 값 저장
		// 인터페이스는 객체를 만들 수가 없기 때문에
		// 인터페이스 배열의 요소에는 인터페이스를 상속받은 자식 객체가 저장된다.
		carInterfaceArr[0] = new HuyndaiCar("제네시스", 5000, "검정");
		carInterfaceArr[1] = new KiaCar("k9", 5000, "흰색");
		
		// 3. 인터페이스 배열의 값 사용
		// 인터페이스에 정의된 메소드만 사용할 수 있다.
		carInterfaceArr[0].carInfo();
//		carInterfaceArr[0].speedUp();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
