package chap12_interface.board;

//1.인터페이스(interface)
//인터페이스는 추상클래스보다 추상화 레벨이 더 높은 클래스
//추상클래스가 인스턴스 변수, 인스턴스 메소드, 추상 메소드를 가질 수 있는 반면
//인터페이스는 public static final로 선언된 상수와 추상 메소드만 가질 수 있음
//그냥 변수를 선언해도 컴파일러에 의해서 public static final이 자동으로 붙어서 생성됨
//메소드도 마찬가지로 그냥 선언해도 public abstract가 붙어서 생성됨
//인터페이스의 메소드는 추상메소드이기 때문에 구현부({}블록)를 만들 수 없음
//인터페이스도 추상클래스의 일종이기 때문에 객체 생성 불가.자식 객체를 사용
//변수를 선언할 때 타입으로는 지정 가능
//인터페이스의 변수는 public static final이 붙고, 메소드에는 public abstract이 붙기 때문에
//인터페이스에서 선언된 변수나 메소드의 접근제어자는 무조건 public이다.
public interface Board {
	//변수는 static final로 지정되기 때문에 
	//static 키워드에 의해서 메모리에 저장될 때 값이 저장이 되어 있지 않으면 안되기 때문에
	//선언 시 값을 지정하지 않으면 에러 발생
//	int num;
	int num=10;
	
	//인터페이스에서 정의되는 모든 메소드는 추상메소드이기 때문에
	//구현부({}블록)을 만들면 에러 발생
//	void post() {
//		System.out.println("글 등록");
//	}
	
	//메소드는 선언만 한 상태로 정의한다.
	void post();
	void modify();
	void delete();
	
	//인터페이스에 기능을 추가하면 상속받은 모든 자식 클래스를 수정해야되는 문제 발생
	//이러한 문제를 해결하기 위해 나온 문법이 default 메소드
	//아래와 같이 작성하면 모든 자식 클래스에 구현을 해야되는 번거로움 발생
//	void getList();
	
	//default메소드는 인터페이스의 메소드에 구현부({}블록)까지 만들 수 있는 메소드
	//default메소드는 구현부를 만들 수 있기 때문에 상속받은 자식클래스에서
	//구현하지 않아도 된다.
	default void gerList() {
		System.out.println("게시글 목록 조회");
	}
}