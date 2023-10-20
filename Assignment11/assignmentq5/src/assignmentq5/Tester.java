package assignmentq5;

public class Tester {

	public static void main(String[] args) {
		Map<Integer,Student> map = new LinkedHashMap<>();
		int choice;
		while((choice = menu()) != 0)
		{
			Scanner sc = new Scanner(System.in);
			switch(choice) {
			case 1:
				Student s = new Student();
				s.accept();
				map.put(s.getRollno(),s);
				break;
				
			case 2:
				System.out.println("Enter the key rollno ");
				int roll = sc.nextInt();
				Student s1 = map.get(roll);
				System.out.println(s1+",");
				break;
			}
			
		}

	}
	public static int menu()
	{
		int choice;
		System.out.println("1. Insert into map");
		System.out.println("2. Find in map");
		System.out.print("Enter your choice ");
		choice = new Scanner(System.in).nextInt();
		return choice;
		
	}

}

	}

}
