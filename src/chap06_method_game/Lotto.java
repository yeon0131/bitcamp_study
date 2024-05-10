package chap06_method_game;

import java.util.Random;

public class Lotto {
	//1. 1~45까지의 숫자 중 랜덤 값 7개를 저장해서 배열로 리턴하는 메소드 generateLottoArray를 구현하세요
	//매개변수 없음
	public int[] generateLottoArray() { //int 배열로 리턴하는 메소드는 int[] 라고 선언하면 됨
		int[] lotto = new int[7];
		Random random = new Random();
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			
			if(isDuplicated(lotto, i)) {//true일때 즉, 중복되었을때 
				i--;
			}//위 메소드가 false일때 여기까지 올 수 있음 즉, 중복되지 않았을 때
		}
		return lotto;
		
	}
	
	//2. 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드 isDuplicated 구현
	//리턴타입 boolean=>중복이 됐으면 true 리턴, 없으면 false 리턴
	public boolean isDuplicated(int[] arr, int index) {
		for(int i=0; i<index; i++) {
			if(arr[index]==arr[i]) {
				return true;
			}
		}
		return false;
	}

}
