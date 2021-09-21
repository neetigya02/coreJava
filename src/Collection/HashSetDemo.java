package Collection;

import java.util.*;

public class HashSetDemo {
	public static void main(String args[]) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("Geeks");
		lhs.add("For");
		lhs.add("Geeks");
		lhs.add("Is");
		lhs.add("Very helpful");

		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}