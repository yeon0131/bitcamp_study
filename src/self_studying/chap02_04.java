package self_studying;

import java.util.Scanner;

public class chap02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력행: ");
		int num = sc.nextInt();
		double round = num *2* 3.14;
		
		System.out.printf("반지름의 길이가 %1$d인 원의 넓이는 %2$f입니당 \n",num,round);

	}

}
