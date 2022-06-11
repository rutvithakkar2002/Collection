import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<>();
		ArrayList<Integer>numbers1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Number:");
			int n=sc.nextInt();
			numbers.add(n);
		}
		numbers1.add(137);
		numbers1.add(237);
		numbers1.add(473);
		//numbers.addAll(numbers);
		numbers1.addAll(numbers);  //not working
		System.out.println(numbers1);
	}
}
