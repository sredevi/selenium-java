package selenium.java;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number to store in an Array, Enter 0 to exit");
			int userinput=sc.nextInt();
			if(userinput==0)
				break;
			arr[i]=userinput;
		}
		System.out.println("You have entered:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");
		}

	}

}
