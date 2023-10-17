package assignment;

public class StudentComparator implements Comparable<Student> {

	@Override
	public int compareTo(Student s1,Student s2) {
	int diff=-s1.getCity().compareTo(s2.getCity())	;
	if(diff ==0)
	diff=s1.getName().compareTo(s2.getName());
	if(diff ==0)
		diff=Double.compare(s1.getMarks(), s2.getMarks());
	return diff;
		
		
	
		

	}

	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
