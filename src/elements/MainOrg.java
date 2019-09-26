package elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class MainOrg {

	public static void main(String[] args) {
		String name;

		ElementsHelper ep = new ElementsHelper();
		Organization organization1 = (Organization) ep.createOrganization();
		ArrayList<Employee> arr = new ArrayList<>();
		Employee e1 = new Employee((long) 3443655, "George W.", "Bush", 1946, "Sales", 4);
		Employee e2 = new Employee((long) 6659811, "Barack", "Obama", 1961, "Marketing", 3);
		Employee e3 = new Employee((long) 2669112, "George H.W.", "Bush", 1924, "R&D", 5);
		Employee e4 = new Employee((long) 4006985, "Bill", "Clinton", 1946, "Music", 2);
		Employee e5 = new Employee((long) 6981225, "Richard", "Nixon", 1913, "Guard at the gates of hell", 666);
		Employee e6 = new Employee();

		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		arr.add(e5);
		arr.add(e6);
		organization1.addAll(arr);
		System.out.println();
		System.out.println("Printing all employees");
		System.out.println(organization1.getAll());

		long idCheck = 3;
		if (organization1.getOneById(idCheck).isPresent()) {
			name = organization1.getOneById(idCheck).get().getFirstName() + " "
					+ organization1.getOneById(idCheck).get().getLastName();
		} else {
			name = "ID does not exists";
		}
		System.out.println("Printing employee with ID #" + idCheck);
		System.out.println(name);

		System.out.println("Employees by criteria(Levels: 2 to 5)");
		Collection<Employee> c = organization1.getAllByCriteria((e) -> e.getLevel() != 1 && e.getLevel() <= 5);
		if (c.isEmpty()) {
			System.out.println("No emloyees matching the criteria");
		} else {
			System.out.println(c);
		}

		System.out.println("Sort by ID. Key sorting should do that internally already.");
		Comparator<Employee> helper = (a, b) -> {
			return a.getId().compareTo(b.getId());
		};
		System.out.println(organization1.getAllSortedBy(helper));

		System.out.println("Sort by name, last>first");
		Comparator<Employee> helper2 = (a, b) -> {
			int last = a.getLastName().compareTo(b.getLastName());
			if (last != 0) {
				return last;
			}
			return a.getFirstName().compareTo(b.getFirstName());

		};
		System.out.println(organization1.getAllSortedBy(helper2));

		System.out.println("Eradicating all employees(peacefully)");
		System.out.println(organization1.getAll());
		organization1.clear();
		if (organization1.getAll().size() == 0) {
			System.out.println("Everyone was deleted.");
		}

	}

}
