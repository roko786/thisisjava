package ch02.sec02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x : ");
		String strX = scan.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y : ");
		String strY = scan.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열 : ");
			String data = scan.nextLine();
			if(data.equals("q"))
				break;
			System.out.println("출력 문자열 : " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		
	}

}
