package task6;
import java.util.Scanner;
public class App {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		CustomList<Integer> l = new CustomList<Integer>();
		char ch='y';
		
		while(ch=='y' || ch=='Y') {
		
			System.out.println("Choose an Option : ");
			System.out.println("1.Add an Element.");
			System.out.println("2.Rempve an Element.");
			System.out.println("3.Get an Element.");
			System.out.println("4.Get Current Size");
			System.out.println("5.Print Whole List");
			
			
			int choosen=sc.nextInt();
			
			switch(choosen) {
				case 1:
					System.out.println("Enter the element to be added : ");
					int input=sc.nextInt();
					l.add(input);
					break;
					
				case 2:
					System.out.print("Enter the index of element to be removed : ");
					int index=sc.nextInt();
					System.out.println("Element removed is : "+l.remove(index));
					break;
				
				case 3:
					System.out.println("Enter the index : ");
					index=sc.nextInt();
					System.out.println("Element at "+index+" is "+l.get(index));
					break;
				
				case 4:
					System.out.println(l.size());
					break;
					
				case 5:
					System.out.println(l);
					break;
					
				default:
					System.out.println("wrong choosen!!");
			}
			System.out.println("Wanna Continue? (y or Y for Yes ) ");
			ch=sc.next().charAt(0);
			sc.close();
		}
	}
}
