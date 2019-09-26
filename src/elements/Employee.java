package elements;

public class Employee {
	private Long id;
	private String firstName;
	private String lastName;
	private int birthyear;
	private String department;
	private int level;

	public Employee() {
	}

	public Employee(Long id, String firstName, String lastName, int birthyear, String department, int level) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthyear = birthyear;
		this.department = department;
		this.level = level;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthyear=" + birthyear
				+ ", department=" + department + ", level=" + level + "]";
	}

}
