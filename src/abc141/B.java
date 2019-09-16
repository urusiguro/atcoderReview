package abc141;

import utility.FastScanner;

public class B {
	//cost: 73ms
	public static void main(String args[]) {

		FastScanner sc = new FastScanner();
		String n[] = sc.next().split("");

		boolean result = true;
		for (int i = 0; i < n.length; i++) {
			if (n[i].equals((i + 1) % 2 == 0 ? "R" : "L")) {
				result = false;
				break;
			}
		}

		System.out.println(result ? "Yes" : "No");
	}

	//cost :69ms
	//break or returnのコスト差はあまり
	public static void review(String args[]) {

		FastScanner sc = new FastScanner();
		//Stringクラスを利用したことがコスト3msを生み出した
		//toCharArrayは覚えておく
		char n[] = sc.next().toCharArray();

		boolean result = true;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == (((i + 1) % 2 == 0) ? 'R' : 'L')) {
				//breakせずにreturnし、後続で三項演算子使わなければ1ms早くなる
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}