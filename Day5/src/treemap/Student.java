package treemap;

public class Student {
	private int sId;
	private String sname;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sname, int age) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.age = age;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return this.sId + " "+ this.sname+" "+this.age;
	}
	
	
}
