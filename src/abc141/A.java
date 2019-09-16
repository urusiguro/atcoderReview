package abc141;

import utility.FastScanner;

public class A {
	/*
	 * 1位と2msの差しかないため、最適とする
	 */
	public static void main(String args[]) {

		FastScanner sc = new FastScanner();
		String n = sc.next();

		System.out.println(n.equals("Sunny") ? "Cloudy" : n.equals("Cloudy") ? "Rainy" : "Sunny");
	}
}