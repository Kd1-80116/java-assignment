package assignment8;
class Box<T extends Employee>{
	private T obj;
	public void set(T val) {
		this.obj=val;
	}
	public T get() {
		return this.obj;
		
	}
	public double getCalculateToatalSalary() {
		
		return obj.calculateSalary();
	}
	
	
	
	
	
}











public class Main {

	public static void main(String[] args) {
		Manger m=new Manger();
		m.acceptManger();
		m.displayManger();
		Box<Manger>b1=new Box<>();
		b1.set(m);
		System.out.println("manger salary="+ b1.getCalculateToatalSalary());
		Salesman s=new Salesman();
		s.acceptSalesman();
		s.displaySalesman();
		

	}

}
