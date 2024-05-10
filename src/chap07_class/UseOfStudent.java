package chap07_class;

import chap07_class.student.copy.Student;

public class UseOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("홍길동",20,"컴공");
		
		String[] strArr = new String[5];
		Student[] studentArr = new Student[5];
		
		studentArr[0] =new Student("홍길동",20,"컴공");
		studentArr[1] =new Student("김션",25,"컴공");
		studentArr[0] =new Student("장길산",23,"수학과");
		
		for(Student st: studentArr) {
			st.studentInfo();
		}
		
		student.studentInfo();

	}

}
