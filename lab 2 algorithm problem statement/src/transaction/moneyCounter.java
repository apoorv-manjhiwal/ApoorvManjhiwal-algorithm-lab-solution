package transaction;

import java.util.Scanner;

public class moneyCounter {
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of transactions");
		
		int noOfTransactions = sc.nextInt();
		int arr[] = new int[noOfTransactions];
		System.out.println("enter the transaction values");
		
		for (int i = 0; i<arr.length; i++ ) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("enter the number of targets");
		
		int noOfTargets = sc.nextInt();
		
		while(noOfTargets-- !=0) {
			System.out.println("enter the value of the targets");
			long targetValue = sc.nextInt();
			System.out.println(targetValue);
			
		}
	}

}
