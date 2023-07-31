import java.util.*;
public class Marks {

	public static void main(String[] args) {
		int [] arr = new int[5];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter The Marks");
	
	
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i] = scan.nextInt();
		
	}
	System.out.println("The marks are");
	
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	}

}
