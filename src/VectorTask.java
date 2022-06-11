import java.util.Scanner;
import java.util.Vector;

public class VectorTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector<Integer>list =new Vector<>();
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter number: ");
			int n=sc.nextInt();
			list.add(n);
		}
		int even=0;
		int odd=0;
		for(int i=0;i<10;i++)
		{
			if(list.get(i)%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("There are "+even+" even numbers in the vector.");
		System.out.println("There are "+odd+" odd numbers in the vector.");
	}
}

/*1) Take 10 numbers from user store into Vector , count how many ood and even numbers prenet 
in vector*/