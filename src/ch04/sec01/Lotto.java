package ch04.sec01;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[6];
		int lottoNum;
		
		for(int i = 0 ; i < 6 ; i++) {
			lottoNum = (int)(Math.random() * 45) +1;
			x[i] = lottoNum;
			System.out.println(x[i]);
		}
		System.out.println("end");
	}

}
