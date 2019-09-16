package abc141;

import java.util.ArrayList;
import java.util.List;

import utility.FastScanner;

public class C {
	//cost 693-759ms
	public static void main(String args[]) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < q; i++) {
			a[sc.nextInt() - 1]++;
		}
		for (int x : a) {
			System.out.println(k + x - q <= 0 ? "No" : "Yes");
		}
	}

	//cost 156ms
	public static void review() {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < q; i++) {
			a[sc.nextInt() - 1]++;
		}

		//sysoutを繰り返し内で呼び出していたのが敗因
		//StringBufferで処理すると、最後の改行文字の扱いが厄介なので
		//脳死でListを選択
		List<String> str = new ArrayList<>();
		for (int x : a) {
			str.add(k + x - q <= 0 ? "No" : "Yes");
		}
		System.out.println(String.join(System.getProperty("line.separator"), str));
	}
}
