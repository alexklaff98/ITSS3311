
import java.util.Scanner;
public class StrictlyIdentical {

	
	//sample run and github
	/*


	https://github.com/alexklaff98/ITSS3311.git



	Enter first list of 5 integers: 
	1 2 3 4 5
	Enter second list of 5 integers: 
	1 2 3 4 5
	Two lists are strictly identical
	*/
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //scanner for input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first list of 5 integers: ");
		//declares first list with size 5
		int[] list1= new int[5];
		for(int i=0; i< list1.length; i++) list1[i]=input.nextInt();
		
		
		//prompts user to input the second list
		System.out.println("Enter second list of 5 integers: ");
		//declares second list with size 5
		int[] list2= new int[5];
		for (int i=0; i<list2.length;i++) list2[i]=input.nextInt();
		
		//calls on equal method to determine if the lists are identical
		if(equals(list1, list2)) {
			System.out.println("Two lists are strictly identical");
		} else {
			System.out.println("Two lists are not strictly identical");
		}
		
		
		
		
	}

	public static boolean equals(int[] list1, int[] list2)//equals method
	{
		if(list1.length != list2.length)return false; //comparing length
		
		for(int i=0; i<list1.length; i++) {
			if(list1[i] != list2[i]) return false;
		}
		
	     return true;
	}
	
	
}

//sample run and github
/*


https://github.com/alexklaff98/ITSS3311.git



Enter first list of 5 integers: 
1 2 3 4 5
Enter second list of 5 integers: 
1 2 3 4 5
Two lists are strictly identical
*/