package abc140;
import java.util.Scanner;

import utility.FastScanner;

public class A {

	public static void mainWA1(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		//powの引数…
		System.out.println(a == 1 ? (long)1 : (long)Math.pow(2,3));
	}

	/*
	 * cost:116
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		long result = (long)Math.pow(a,3);
		System.out.println(a == 1 ? 1 : result);
	}

	/*
	 * result:ac
	 * cost:69
	 */
	public static void review(String args[]){
		//Scanner -> fastScannerで25ms高速化可能
		FastScanner sc = new FastScanner();

		//Math.powクラス使うよりこのくらいなら普通に掛け算したほうが早い
		int x = sc.nextInt();
		System.out.println(x * x * x);
	}
}