package ex_Cal_Judge3Mul;

import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("==========");
		System.out.println("3�� ��� �Ǻ� ���α׷�.");
		System.out.println("==========");
		System.out.println("���ڸ� �Է��ϼ���.");
		input = sc.nextInt();
		
		if(input%3 == 0)
			System.out.println("3�� ����Դϴ�.***");
		else
			System.out.println("***3�� ����� �ƴմϴ�.");
		
	}

}
