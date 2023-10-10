package question_1;

public class Employee_Test {

	public static void main(String[] args) {
		Employee s=new Employee("atish","patil",20000);
		System.out.println("first_name="+ s.getFirst_Name()+ "   "+ "last_name="+s.getLast_Name()+ " "+"salary="+ s.getMonthly_Salary());
        s.setFirst_Name("shubham");
        s.setLast_Name("walke");
        s.setMonthly_Salary(1000000);
        System.out.println("first_name="+ s.getFirst_Name()+" "+ "last_name="+ s.getLast_Name()+" "+"salary="+s.getMonthly_Salary()+" ");
	}

}
