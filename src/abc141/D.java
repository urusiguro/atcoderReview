package abc141;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import utility.FastScanner;

public class D {
	public static void main(String args[]) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();

		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			q.add(sc.nextInt());
		}

		for (int i = 0; i < m; i++) {
			q.add(q.poll() / 2);
		}

		long result = 0;
		for (int x : q) {
			result += x;
		}

		System.out.println(result);
	}

	public static void review(String args[]) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();

		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			q.add(sc.nextInt());
		}

		for (int i = 0; i < m; i++) {
			q.add(q.poll() / 2);
		}

		//q.parallelStream().mapToLong(val -> Integer.toUnsignedLong(val)).sum()
		//下記が179ms parallelStreamが264ms Streamが262msだった(q.length < 10^5)
		long result = 0;
		for (int x : q) {
			result += x;
		}

		System.out.println(result);
	}
}