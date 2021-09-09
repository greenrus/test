package test;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] avg = new double[6];			
		
		for (int i = 0; i < avg.length; i++) {
			avg[i] = sc.nextDouble();
		}
		int idx1 = sc.nextInt() - 1;
		int idx2 = sc.nextInt() - 1;
		
		sc.close();
		
		double sum = avg[idx1] + avg[idx2];
		
		System.out.printf("%.1f", sum);

	}
}