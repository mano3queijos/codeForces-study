package br.com.codeforces.Ateam;

import java.util.Random;
import java.util.Scanner;

public class Ateam {

	static Scanner scan = new Scanner(System.in);
	static Random randon = new Random();

	public static void main(String[] args) {
		Integer n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println(vasyasView(n)[i] + " " + tonyasView(n)[i] + " " + petyaView(n)[i] + " ");

		}
	}

	static Integer[] vasyasView(Integer n) {

		Integer[] view = new Integer[n];
		for (int i = 0; i < n; i++) {
			view[i] = randon.nextInt(2);
		}
		return view;

	}

	static Integer[] tonyasView(Integer n) {

		Integer[] view = new Integer[n];
		for (int i = 0; i < n; i++) {
			view[i] = randon.nextInt(2);
		}
		return view;

	}

	static Integer[] petyaView(Integer n) {

		Integer[] view = new Integer[n];
		for (int i = 0; i < n; i++) {
			view[i] = randon.nextInt(2);
		}
		return view;

	}
}
