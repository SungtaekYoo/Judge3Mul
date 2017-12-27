package ex_Cal_Judge3Mul;

import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("==========");
		System.out.println("3의 배수 판별 프로그램.");
		System.out.println("==========");
		System.out.println("숫자를 입력하세요.");
		input = sc.nextInt();
		
		if(input%3 == 0)
			System.out.println("3의 배수입니다.***");
		else
			System.out.println("***3의 배수가 아닙니다.");
		
	}

}
