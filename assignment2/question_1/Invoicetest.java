package question_1;

public class Invoicetest {

	public static void main(String[] args) {

				
		   Invoice s=new Invoice("99f","toy",4,500.00);
		   System.out.println("part_number=" + s.getpart_Number() + " " + "part_descrription=" + s.getpart_Description()+ "  "+"quantity="+ s.getQuantity()+"  "+ "price=" + s.getPrice()+ " "+"amount=" + s.getinvoiceAmount());
		   s.setpart_Number("123");
		   s.setpart_Description("monkey");
		   s.setPrice(123);
		s.setQuantity(12);
		System.out.println("after changing=");
		System.out.println("part_number=" + s.getpart_Number()+" " + "part_descrription=" + s.getpart_Description()+" "+"quantity="+ s.getQuantity()+"price="+ s.getPrice()+" " +"amount=" +s.getinvoiceAmount());
			}
			 

	}


