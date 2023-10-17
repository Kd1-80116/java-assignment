/*3. Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
3rd level sorting should be on name (asc)*/





package assignment;

public class Student{
	private int roll;
	private String name;
	private String city;
	private double marks;
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	//@Override
	//public int compareTo(Student k1,Student k2) {
     //int diff=-(k1.getCity().compareTo(k2.getCity()));
     //if(diff ==0)
    	// diff=-(-k1.getMarks().compareTo(k2.getMarks()));
     //if(diff ==0)
    	 //diff=-(k1.getName().compareTo(k2.getName()));

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


