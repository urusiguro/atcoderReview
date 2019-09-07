package abc140;

import java.util.Scanner;

import utility.FastScanner;

public class B {
	//cost:113
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		for (int j = 0; j < n; j++) {
			a[j] = sc.nextInt();
		}

		for (int j = 0; j < n; j++) {
			b[j] = sc.nextInt();
		}

		for (int j = 0; j < n - 1; j++) {
			c[j] = sc.nextInt();
		}

		int result = 0;
		int beforeEat = -1;
		for (int x : a) {
			result += b[x - 1];

			if ((beforeEat + 1) == x) {
				result += c[x - 2];
			}
			beforeEat = x;
		}

		System.out.println(result);
	}

	//cost:68
	public static void review(String args[]) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();

		int a[] = new int[n];
		int c[] = new int[n - 1];

		for (int j = 0; j < n; j++) {
			a[j] = sc.nextInt();
		}

		//Bを変数にバインドしなければ高速になる
		int result = 0;
		for (int j = 0; j < n; j++) {
			result += sc.nextInt();
		}

		for (int j = 0; j < n - 1; j++) {
			c[j] = sc.nextInt();
		}


		for (int i = 0; i < n - 1; i++) {
			result += (a[i] + 1 == a[i + 1] ? c[a[i] - 1] : 0);
		}

		System.out.println(result);
	}
}