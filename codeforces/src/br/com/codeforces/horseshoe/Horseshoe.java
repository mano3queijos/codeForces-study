package br.com.codeforces.horseshoe;

import java.util.Scanner;

public class Horseshoe {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] horseShoe = new int[4];
		int value =0;
		horseShoe[0] = scan.nextInt();
		horseShoe[1] = scan.nextInt();
		horseShoe[2] = scan.nextInt();
		horseShoe[3] = scan.nextInt();
		
		for (int i = 0; i < horseShoe.length; i++) {
			System.out.println(horseShoe[i]);

			for (int j = i+1; j < horseShoe.length; j++) {
				System.out.println(horseShoe[j]);

				if (horseShoe[i] == horseShoe[j]) {
					value++;
				}
			}

		}

		System.out.println(value);
scan.close();
	}
	

}
