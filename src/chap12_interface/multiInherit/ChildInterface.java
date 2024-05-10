package chap12_interface.multiInherit;

public class ChildInterface implements FatherInterface, MotherInterface {

	@Override
	public void calm() {
		// TODO Auto-generated method stub
		System.out.println("어머니는 침착하다.");

	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("아버지는 잘 고친다.");

	}

}
