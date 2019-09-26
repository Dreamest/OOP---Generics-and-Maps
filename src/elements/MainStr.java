package elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class MainStr {

	public static void main(String[] args) {
		ElementsHelper eh = new ElementsHelper();
		StringManager myStrings = (StringManager) eh.createStringManager();
		ArrayList<String> arr = new ArrayList<>();

		arr.add("The leper King");
		arr.add("Watches leaves on a tree");
		arr.add("This one may ling long on that we agree");
		arr.add("He plucks one at random and shows no remose");
		arr.add("To the wind he would muse I've saved it from worse");
		arr.add(null);

		myStrings.addAll(arr);
		System.out.println(myStrings.getAll());

		int size = 25;
		System.out.println("Strings under " + size + " characters.");
		Collection<String> c = myStrings.getAllByCriteria(s -> s.length() < size);
		if (c.isEmpty()) {
			System.out.println("No elements matching the criteria");
		} else {
			System.out.println(c);
		}

		System.out.println("Strings in reverse alphabetical order.");
		Comparator<String> helper = (a, b) -> {
			return b.compareTo(a);
		};
		System.out.println(myStrings.getAllSortedBy(helper));

		System.out.println("Removing strings.");
		myStrings.clear();
		if (myStrings.getAll().isEmpty()) {
			System.out.println("No elements in list");
		} else {
			System.out.println(myStrings);
		}

	}

}
