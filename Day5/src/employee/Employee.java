package employee;

public class Employee {
	
	private int id;
	private String name;
	private String designation;
	private String department;
	
	
	public Employee(int id, String name, String designation, String department) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.designation + " " + this.department;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}


	@Override
	public boolean equals(Object obj) {
		EmployeeMap emp = (EmployeeMap) obj;
		return this.hashCode() == emp.hashCode();
	}
	
	
}
