import java.util.*;
class ifriend{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("+-----------------------------------+");
		System.out.println("|      Add Contact to the list      |");
		System.out.println("+-----------------------------------+");
		
		System.out.println("index");
		System.out.println("=====");
		System.out.println("");
		
		System.out.print("Name                : ");
		String Name = input.next();
		
		System.out.print("Phone Number      : ");
		int phone_number=input.nextInt();
		
		System.out.print("Company Name      : ");
		String Company=input.next();
		
		System.out.print("Salary            : ");
		int Salary=input.nextInt();
		
		System.out.print("B'Day(YYYY-MM_DD) : ");
		String BDay=input.next();
	}
}

