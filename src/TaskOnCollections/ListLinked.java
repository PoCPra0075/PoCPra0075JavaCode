package TaskOnCollections;

import java.util.List;

public class ListLinked {

	public static void main(String[] args) {

		// List - Interface 
		// linkedList - Class
		List<Integer> list = new java.util.LinkedList<Integer>();

		// Add Element
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(70);

		System.out.println(list);

		System.out.println(list.get(4));
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(3));

		System.out.println(list.contains(100));

		System.out.println(list.size());
		System.out.println(list.lastIndexOf(40));


	}
}