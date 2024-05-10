package chap05_array;

public class _02_ArratExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장하세용
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*3;
			System.out.println(arr[i]);
		}
		System.out.println();
		//2.while문으로 변경
		int j=0;
		while(j<arr.length) {
			arr[j] = (j+1)*3;
			System.out.println(arr[j]);
			j++;
		}

	}

}
