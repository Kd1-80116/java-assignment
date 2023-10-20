package assignment12;

public class main {

	public static void main(String[] args) {
		Emp[]arr=new Emp[3];
		arr[0]=new Manger(100.2,200.3);
		arr[1]=new labour(100.3,200.4);
		arr[2]=new Clerk(1000.4);
		double total=Emp.calculateincome(arr);
		System.out.println("total income="+total);
		

	}

}
