package chap06_method;

import java.util.Scanner;

import chap06_method_calk.CompleteCalculator;

public class _04_UseOfCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteCalculator cCalc = new CompleteCalculator();
		
		int result;
		double dResult;
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		a=sc.nextInt();
		
		System.out.println("숫자를 입력하세요: ");
		b=sc.nextInt();
		
		result = cCalc.add(a, b);
		System.out.println(a+"+"+b+"="+result);
		
		result = cCalc.sub(a, b);
		System.out.println(a+"-"+b+"="+result);
		
		result = cCalc.mul(a, b);
		System.out.println(a+"*"+b+"="+result);
		
		dResult = cCalc.div(a, b);
		System.out.println(a+"/"+b+"="+dResult);
		
		result = cCalc.mod(a, b);
		System.out.println(a+"%"+b+"="+result);

	}

}
