package abc140;

import java.util.Scanner;

import utility.FastScanner;

public class C {
	//cost:247
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		a[0] = sc.nextInt();

		int curentInt = a[0];
		int beforeCur = curentInt;
		for (int i = 1; i < (n - 1); i++) {
			curentInt = sc.nextInt();
			a[i] = (beforeCur > curentInt) ? curentInt : beforeCur;
			beforeCur = curentInt;
		}

		a[n - 1] = curentInt;

		long sum = java.util.Arrays.stream(a).sum();
		System.out.println(sum);
	}

	//cost:70
	public static void review(String args[]) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();

		int sum = 0;
		int curentInt = sc.nextInt();
		sum += curentInt;
		int beforeCur = curentInt;
		for (int i = 1; i < (n - 1); i++) {
			curentInt = sc.nextInt();
			sum += (beforeCur > curentInt) ? curentInt : beforeCur;
			beforeCur = curentInt;
		}

		sum += curentInt;
		System.out.println(sum);
	}
}