package selenium.java;

public class ArrayDemo {

	public static void main(String[] args) {
		int rollNumberArray[]=new int[15];
		rollNumberArray[0]=100;
		rollNumberArray[1]=105;
		rollNumberArray[2]=107;
		rollNumberArray[3]=103;
		rollNumberArray[4]=99;
		rollNumberArray[5]=101;
		for (int i=0;i<6;i++) {
		System.out.println(rollNumberArray[i]);
		}
		//Example 2
		int rollNumber[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Total student count: "+rollNumber.length);
		for(int i=0;i<rollNumber.length;i++) {
			System.out.println(rollNumber[i]);	
		}
		String names[]= {"Name1","Name2"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}

	}

}
