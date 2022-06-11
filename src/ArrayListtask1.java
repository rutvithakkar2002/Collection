//collection --topic
//Collection--Interface
//Collections--class
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListtask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>numbers=new ArrayList<>();
		int n;
		int max=0;
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter number: ");
			n=sc.nextInt();
			numbers.add(n);
		}
		max=numbers.get(0);
		for(int i=0;i<=3;i++)
		{
			if (numbers.get(i)> max)
			{	
 				max = numbers.get(i);
			}
		}
		System.out.println("Maximum number is: "+max);
	}
}
//List-->class
//ArrayList
//Set  -->Interface
//Queue-->class
//Set-->Interface
//Map-->class


