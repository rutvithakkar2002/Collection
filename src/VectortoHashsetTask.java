import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class VectortoHashsetTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector<Integer>list =new Vector<>();
		
		list.add(10);
		list.add(200);
		list.add(30);
		list.add(200);
		list.add(50);
		list.add(400);
		list.add(50);
		
		System.out.println(list);

		HashSet<Integer> hs = new HashSet<>(list);//convert vector into hash set.
		
		System.out.println(hs.contains(220));  //false
		System.out.println(hs);
	}	

}

//convert vector into hash set. 
//check number 222 is present in hash set or not. 

//print all the elements of hash set. 
	