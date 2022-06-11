import java.util.ArrayList;
import java.util.Scanner;

public class Numberdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter number: ");
		for (int i = 0; i <=5; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println("The List is: " + list);
		System.out.println(list.get(0));
		for (int i = 1; i<list.size(); i++) {
			System.out.println(list.get(i) - list.get(i-1) );	
		}
	}
}
/*
 * 3) take 6 numbers from user print difference of all numbers. e.g list =
 * [1,6,3,4,5,6] output: 1 5 -3 1 1 1
 */
