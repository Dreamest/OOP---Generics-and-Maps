package elements;

public class ElementsHelper {
	/**
	 * This is a helper method that creates a new object of your Organization class
	 * @return an new Organization object
	 */
	public ElementsCollection<Employee, Long> createOrganization(){
		return new Organization();
	}
	
	/**
	 * This is a helper method that creates a new object of your StringManager class
	 * @return an new StringManager object
	 */
	public ElementsCollection<String, String> createStringManager(){
		return new StringManager();
	}
}
