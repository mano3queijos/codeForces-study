package br.com.codeforces.boiorgirl;

import java.util.Scanner;

public class BoyOrGirl {	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	String name = scan.next();
	
	
	if(name.length() % 2 == 0) {
		System.out.println("CHAT WITH HER!");
	}
	else {
		System.out.println("IGNORE HIM!");
	}
	}
}
