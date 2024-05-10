package chap99_homework.homework04;

import java.util.Scanner;

public class ShowEmployeeInfo extends UseOfEmplyee {
	public void showEmployeeInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사원의 사번을 입력하세요.");
		int putNum = sc.nextInt();
		
		switch(eno) {
		case 1:
			System.out.println("사번:");
			System.out.println("이름:");
			System.out.println("보너스:");
		case 2:
			System.out.println("사번:");
			System.out.println("이름:");
			System.out.println("급여:");
			System.out.println("근무년수:");
		case 3:
			System.out.println("사번:");
			System.out.println("이름:");
			System.out.println("급여:");
			System.out.println("근무년수:");
		case 4:
			System.out.println(empArr);
		case 5:
			
		case 6:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}

}
