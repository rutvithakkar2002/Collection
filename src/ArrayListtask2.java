import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListtask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>numbers=new ArrayList<>();
		int n;
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter number: ");
			n=sc.nextInt();
			numbers.add(n);
		}
		System.out.println("Before Sorting....");
		for (int i=0; i<=3; i++) 
		{
			System.out.println(numbers.get(i));
		}
		
		
		Collections.sort(numbers);
		
		System.out.println("\n After Sorting numbers are: ");
		for(int i=0;i<=3;i++)
		{
			System.out.println(numbers.get(i));
		}		
		/*for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3-1;j++)
			{
				if(numbers.get(j)>numbers.get(j+1))
				{
					temp=numbers.get(j);
					numbers.get(j)=numbers.get(j+1);
					numbers.get(j+1)=temp;
				}
			}
		}*/
	}
}
