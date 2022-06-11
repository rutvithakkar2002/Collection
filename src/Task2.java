import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Number:");
			int n=sc.nextInt();
			numbers.add(n);
		}
		System.out.println(numbers);
		numbers.remove(2);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("second element is: "+numbers.get(2));
		System.out.println(numbers.contains(420));
	}
}
