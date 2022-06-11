import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class VectorTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector<Integer>list =new Vector<>();
		Vector<Integer>list1 =new Vector<>();
		ArrayList<Integer>l=new ArrayList<>();
		//ArrayList Elements
		l.add(3);
		l.add(3);
		l.add(0);
		l.add(1);
		list1.addAll(l);
		
		System.out.println(list1);
		list1.addAll(l);
		System.out.println(list1);
		
		//vector elements
		list.add(10);
		list.add(200);
		list.add(30);
		list.add(400);
		list.add(50);
		System.out.println(list);
	}
	
}

/*
 * create 1 vector with 5 elements.
 * 
 *  create  1 vector with same element that u have in array list . [ copy all the elements of array list into vector ] 
 */

