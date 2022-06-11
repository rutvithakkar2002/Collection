import java.util.ArrayList;
import java.util.Scanner;
public class MergearrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>numbers=new ArrayList<>();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("enter number");
			int num = sc.nextInt();
			numbers.add(num); // add --> insert --> index --> 0
		}
		
	}
}

/*2) Take 5 numbers from user , now merge this 5 numbers and 10 numbers which u have in 1st
 question and print all 15 numbers.
v1 = 1,2,3,4,5,6,7,8,9,10
v2 = 11,22,33,44,55
v3 = 1,2,3,4,5,6,7,8,9,10,11,22,33,44,55*/
