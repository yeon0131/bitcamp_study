package chap06_method.score;

public class Score {
	//1. int형 (점수)배열을 매개변수로 받아서 점수의 총합을 int형으로 리턴하는 메소드 
	//getTotalScore을 구현하세요
	public int getTotalScore(int[] scores) {
		int total=0;
		for(int i=0; i<scores.length; i++) {
			total+=scores[i];
		}
		return total;
	}
	
	//2. int형 (점수)배열을 매개변수로 받아서 점수의 평균을 double형으로 리턴하는 메소드
	//getAvgScore를 구현
	public double getAvgScore(int[] scores) {
		int total=0;
		double avg=0;
//		for(int i=0; i<scores.length; i++) {
//			total+=scores[i];
//			avg=total/scores.length;
//		}
//		return avg;
		return (double)getTotalScore(scores)/scores.length;
	}

}
