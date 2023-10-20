package assignmentq5;

import java.util.Scanner;

public class Student {
		private int rollno;
		private String name;
		private double marks;
		
		public Student() {
			// TODO Auto-generated constructor stub
		}

		public Student(int rollno, String name, double marks) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getMarks() {
			return marks;
		}

		public void setMarks(double marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
		}

//		@Override
//		public int hashCode() {
//			return Objects.hash(rollno);
//		}
	//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Student other = (Student) obj;
//			return rollno == other.rollno;
//		}

		public void accept()
		{
			System.out.print("Enter the Rollno ");
			Scanner sc = new Scanner(System.in);
			this.rollno=sc.nextInt();
			System.out.print("Enter the name ");
			this.name=sc.next();
			System.out.print("Enter the marks ");
			this.marks=sc.nextDouble();
		}
		
	}

