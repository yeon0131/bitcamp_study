package chap07_class.game;

import java.util.Random;
import java.util.Scanner;

public class Numbaseball {
	//1. 컴퓨터가 0~9 까지 숫자 중 랜덤한 값 3개를 배열에 저장(단 중복불가)
	//2. 사용자가 0~9까지 숫자 세개 입력(중복불가)
	//3. 사용자가 입력한 숫자 중 컴퓨터가 갖고 있는 숫자와 같은 숫자면서 위치가 다르면 볼로 판단
	//4. 사용자가 입력한 숫자 중 컴퓨터가 갖고 있는 숫자와 같은 숫자면서 위치가 같으면 스트라이크로 판단
	// com {1,2,3} user{1,3,5} ==> 1스트라이크 1볼
	// com {1,2,3} user{4,5,6} ==> 0스트라이크 0볼
	// com {1,2,3} user{2,3,1} ==> 0스트라이크 3볼
	// com {1,2,3} user{1,2,3} ==> 3스트라이크 아웃 게임종료
	
	//클래스에 필요한 필드(변수들)
	int strike = 0;
	int ball = 0;
	int[] com = new int[3];
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	//중복체크하는 메소드
	public boolean isDuplicated(int[] arr, int index) {
		for(int i=0; i<index; i++) {
			if(arr[index]==arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	public void start() {
		//1. com배열에 저장될 3개의 숫자 저장
		
		while(true) {
			for(int i=0; i<3; i++) {
				com[i] = rd.nextInt(8);
				if(isDuplicated(com, i)) {	//true일때 즉, 중복되었을때 
					i--;
				}
			}
			//2. user 배열에 입력한 값을 저장
			strike =0;
			ball=0;
			for(int i=0; i<3; i++) {
				System.out.print(i+1+"번째 숫자를 입력하세요(0~9사이): ");
				user[i]=sc.nextInt();
				if(user[i]<0 || user[i]>10) {
					System.out.println("잘못입력함");
					i--;
					continue;
				}
				if(i>0) {
					for(int j=0;j<i;j++) {
						if(user[i]==user[j]) {
							System.out.println("중복값있음. 다시 입력행");
							i--;
							break;
						}
					}
				}
			}	
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(user[i]==com[j]) {
						if(i==j) {
							strike++;
						}else if(strike==3){
							System.out.println("게임종료");
						}else{
							ball++;
						}
					}
				}
			}
			if(strike==3) {
				System.out.println("3스트라이크. 게임종료");
				break;
			}else {
				System.out.println("com: "+com[0]+","+com[1]+","+com[2]);
				System.out.println("user: "+user[0]+","+user[1]+","+user[2]);
				System.out.println(strike+"스트라이크 "+ball+"볼입니다\n");
			}
		}	
	}	
}
