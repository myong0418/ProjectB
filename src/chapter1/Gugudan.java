package chapter1;


import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("input gugudan");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		
		printDan(i);
		
	}

	/**
	 * @param i
	 */
	public static void printDan(int i) {
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
		System.out.println();
	}

}
