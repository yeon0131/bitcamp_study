package chap07_class.student.copy;

public class Student {
	public String name;
	public int age;
	public String major;
	
	public Student() {		//기본생성자
	}
	public Student(String putName) {	//name만 초기화하는 생성자
		this.name = putName;
	}
	public Student(String putName, int putAge) {	//name,age를 초기화하는 생성자
		this.name = putName;
		this.age = putAge;
	}
	public Student(String putName, int putAge,String putMajor) {	
		this.name = putName;
		this.age = putAge;
		this.major = putMajor;
	}
	public void studentInfo() {
		//생성자에서 this 객체가 생성된 객체를 의미한다면
		//인스턴스 메소드에서 this 객체는 해당 메소드를 소유하고 있는 객체를 의미.
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("전공: "+this.major);	//this.000 : 000객체를 소유하는 메소드
	}

}
