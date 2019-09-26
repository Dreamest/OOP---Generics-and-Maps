package elements;

public interface Criteria<T> {
	
	/**
	 * This method helps looking up elements by criteria. The method returns true if the element fits the criteria, or false otherwise.
	 * @param element - element that should be compared to the criteria
	 * @return true if the element fits the criteria or false otherwise
	 */
	public boolean isMatching (T element);
}
