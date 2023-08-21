package br.com.codeforces.horseshoe;

import java.util.*;

public class HorseShoeRight {


	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		Set<Integer> colours = new HashSet();

		colours.add(scan.nextInt());
		colours.add(scan.nextInt());
		colours.add(scan.nextInt());
		colours.add(scan.nextInt());
		System.out.println(4 - colours.size());
	}
}
