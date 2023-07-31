import java.util.*;

public class Percentage {

	public static void main(String[] args) {
		String [] arr = new String [7];
		Scanner scan = new Scanner(System.in);
		System.out.println(" Percentage of the students");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = scan.next();
		}
System.out.println(" students percentages are:");
for(int i =0;i<=arr.length-1;i++)
{
	System.out.println(arr[i]+" ");
}
	}

}
