import java.util.*;
class ifriend{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("+-----------------------------------+");
		System.out.println("|      Add Contact to the list      |");
		System.out.println("+-----------------------------------+");

		int i = 1;
		
		while(true){
				String id = String.format("C%04d", i);
				System.out.println(id);
		
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
				System.out.println("");
			
			System.out.println("Contact has been added succesfully...");
			System.out.println("");
			System.out.print("Do you want add another contact(Y/N) : ");
			String another_num = input.next();
			
			i++;//next id
		
			if(another_num.equalsIgnoreCase("Y")){
				System.out.println(" ");
			}else{
				break;
			}
		}		
	}
}

