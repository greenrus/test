package test;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] avg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 , 80.0 , 90.0 , 70.0 , 60.0 };			
		
		int idx1 = sc.nextInt() - 1;
		int idx2 = sc.nextInt() - 1;
		
		sc.close();
		
		double sum = avg[idx1] + avg[idx2];
		
		System.out.printf("%.1f", sum);

	}
}
