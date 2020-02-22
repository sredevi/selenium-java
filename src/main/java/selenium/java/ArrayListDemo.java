package selenium.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;true;i++) {
			System.out.println("Enter a number to store in an Array, Enter 0 to exit");
			int userinput=sc.nextInt();
			if(userinput==0)
				break;
			arr.add(userinput);
		}
		System.out.println("You have entered:");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+",");
		}

	}

}
