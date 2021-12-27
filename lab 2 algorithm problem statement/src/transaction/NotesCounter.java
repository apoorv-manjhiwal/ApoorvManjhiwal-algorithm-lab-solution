package transaction;

import java.util.Scanner;

public class NotesCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of denominations");

		int noOfDenominations = sc.nextInt();
		int noOfDenomiations = 0;
		int[] arr = new int[noOfDenomiations];

		System.out.println("enter the denomiation values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("enter the payment amount");
		int payment = sc.nextInt();

		sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		countNotes(arr, payment);

	}

	private static void countNotes(int[] arr, int payment) {
		int[] notesCounter = new int[arr.length];
		for(int i = 0; i <arr.length; i++) {
			if(payment >= arr[i]) {
				notesCounter[i] = payment/arr[i];
				payment = payment - notesCounter[i] * arr[i];
				
			}
		}
		if(payment > 0) {
			System.out.println("your paayment method cannot be achieved with the highest denomination");
		}else {
			System.out.println("your payment denominations will be");
			for(int i = 0; i <arr.length; i++) {
				if (notesCounter [i]  !=0) {
					System.out.println(arr[i] + " : " +  notesCounter[i]);
				}
			}
			
		}

	}

	private static void sortArray(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for( int j = 0; j < arr.length-1-i; j++) {
				 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					
				}
			}
			
		}
		
	}


