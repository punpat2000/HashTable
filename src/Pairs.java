import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.internal.ExactComparisonCriteria;

public class Pairs {

	public static ArrayList<Pair> allPairs(int[] a) {
		ArrayList<Pair> result = new ArrayList<Pair>();
		for (int i = 0, j = a.length; i < j; ) {
			Pair p = new Pair();
			p.first = a[i];
			p.second = a[++i % j];
			result.add(p);
		}
		return result;
	}

	public static Hashtable<Integer, Integer> allPairs02(int[] a) {
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		
		for (int i = 0, j = a.length; i < j; h.put(a[i], a[++i % j]));
		
		return h;
	}

	public static int find(ArrayList<Pair> a, int key) throws Exception {

		return a.stream().filter(data -> data.first == key).findFirst().orElseThrow().second;
		
	}

	public static int find02(Hashtable<Integer, Integer> h, int key) throws Exception {

		return h.get(key).intValue();
		
	}

	public static void printArrayListPairs(ArrayList<Pair> r) {
		for (Pair pair : r) {
			System.out.print("(" + pair.first + ", " + pair.second + "), ");
		}
		System.out.println("");
		System.out.println("");
	}

}
