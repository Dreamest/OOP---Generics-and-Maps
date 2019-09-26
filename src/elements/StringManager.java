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

public class StringManager implements ElementsCollection<String, String> {

	private Map<String, String> strMap = new TreeMap<>();

	@Override
	public void addAll(Iterable<String> elements) {
		Iterator<String> iterate = elements.iterator();
		while(iterate.hasNext()) {
			String temp = iterate.next();
			try {
				strMap.put(temp, temp);
			} catch (NullPointerException e) {
				System.err.println("Null string was not added.");
			}
		}
	}

	@Override
	public Collection<String> getAll() {
		return strMap.values();
	}

	@Override
	public Optional<String> getOneById(String id) {
		if(strMap.containsKey(id)) {
			return Optional.of(strMap.get(id));
		}
		return Optional.empty();
	}

	@Override
	public Collection<String> getAllByCriteria(Criteria<String> criteria) {
		return strMap.values().stream().filter(str->criteria.isMatching(str)).collect(Collectors.toList());
	}

	@Override
	public List<String> getAllSortedBy(Comparator<String> comparator) {
		List<String> list = new ArrayList<>(strMap.values());
		list.sort(comparator);
		return list;
	}

	@Override
	public void clear() {
		strMap.clear();
	}

}
