package programs;

public class Employee {
	private int id;
	private String empName;
	private double empSal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int compareTo(Object obj) {
		return compareTo(id);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String empName, double empSal) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}
