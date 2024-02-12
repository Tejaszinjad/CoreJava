package TreeMap;

import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		TreeMap<Laptop, Integer> map = new TreeMap<Laptop, Integer>();
		
		Laptop l1 = new Laptop(8, 25000, "i3");
		Laptop l2 = new Laptop(6, 50000, "i5");
		Laptop l3 = new Laptop(4, 100000, "i7");
		Laptop l4 = new Laptop(16, 150000, "i9");
		
		map.put(l1,1);
		map.put(l2,1);
		map.put(l3,1);
		map.put(l4,1);
		
		for (Laptop l:map.keySet()) {
			System.out.println(l);
		}
	}

}
