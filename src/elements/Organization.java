package elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Organization implements ElementsCollection<Employee, Long> {
	private Map<Long, Employee> employees = new TreeMap<>();

	@Override
	public void addAll(Iterable<Employee> elements) {
		Iterator<Employee> iterate = elements.iterator();
	//	System.out.println(iterate.next());
		while(iterate.hasNext()) {
			Employee temp = iterate.next();
			try {
				employees.put(temp.getId(), temp);
			} catch (NullPointerException e) {
				System.err.println("Invaid employee information " + temp);
			}
		}
	}

	@Override
	public Collection<Employee> getAll() {
		return employees.values();
	}

	@Override
	public Optional<Employee> getOneById(Long id) {
		if(employees.containsKey(id)) {
			return Optional.of(employees.get(id));
		}
		return Optional.empty();
	}

	@Override
	public Collection<Employee> getAllByCriteria(Criteria<Employee> criteria) {
		return employees.values().stream().filter(e -> criteria.isMatching(e)).collect(Collectors.toList());
		/*
		  Collection<Employee> list = new ArrayList<>(); 
		  for (Map.Entry<Long, Employee> employee : employees.entrySet()) {
		  	if(criteria.isMatching(employee.getValue())) { 
		  		list.add(employee.getValue());
		  	} 
		  } 
		  return list;
		 */
	}

	@Override
	public List<Employee> getAllSortedBy(Comparator<Employee> comparator) {
		List<Employee> list = new ArrayList<>(employees.values());
		list.sort(comparator);
		return list;
	}

	@Override
	public void clear() {
		employees.clear();

	}

}
