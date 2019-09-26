package elements;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public interface ElementsCollection<T, K> {
	/**
	 * @param elements - all elements should be added and stored in the attributes of the ElementsCollection 
	 */
	public void addAll (Iterable<T> elements);
	
	/**
	 * @return all elements in the ElementsCollection
	 */
	public Collection<T> getAll();
	
	/**
	 * @param id - a unique id of an element
	 * @return an empty Optional if no element is available for the id, or an Optional with the required element 
	 */
	public Optional<T> getOneById (K id);
	
	/**
	 * This method helps finding all elements that fits a criteria. Criteria can indicate which elements should be returned by this method 
	 * @return all elements in the ElementsCollection that fits a criteria
	 * @see Criteria
	 */
	public Collection<T> getAllByCriteria(Criteria<T> criteria);

	/**
	 * This method returns a sorted list of all elements. Note that the method MUST NOT CHANGE the ElementsCollection, but only sort the returned list
	 * @param comparator - a helper object that indicates how to sort the elements in the returned list
	 * @return a sorted list of all elements in the ElementsCollection
	 */
	public List<T> getAllSortedBy (Comparator<T> comparator);
	
	/**
	 * This method clears all elements in the ElementsCollection
	 */
	public void clear();
}
