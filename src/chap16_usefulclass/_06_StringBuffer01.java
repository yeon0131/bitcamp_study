package chap16_usefulclass;

public class _06_StringBuffer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. StringBuffer 객체 생성
		// 버퍼 크기가 16인 StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer();
		
		// 버퍼 크기가 32인 StringBuffer 객체 생성
		StringBuffer sb2 = new StringBuffer(32);
		
		// bitcamp라는 문자열 값을 갖는 StringBuffer 객체 생성
		StringBuffer sb3 = new StringBuffer("bitcamp");
		StringBuffer sb4 = new StringBuffer("bitcamp");
		
		// capacity(): StringBuffer에 버퍼의 크기를 리턴하는 메소드
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
	}

}
