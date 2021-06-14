package iq;
import java.util.Arrays;
import java.util.Scanner;
public class Iq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This Java code will average out IQ scores entered and give the results based on the average
		 Scanner input = new Scanner(System.in); 
		    int[] testResults = new int[5];//a new array is created holding 5 elements

		    for (int i = 0; i < testResults.length; i++)//for loop asks a user to enter 5 test scores to put into the array
		    {
		        System.out.println("Please enter a test score.");
		        testResults[i] = input.nextInt();
		    }
		
		int sum = 0;// a new variable is created to be the sum
		for(int value : testResults) {
			sum = sum+=value; //a for loop adds all elements to create the sum of the array
		}
		
		int average = sum / 5; //the average of the array is the sum divided by 5
		//if statements find the average IQ level descriptions
		if(average <= 69) {
			System.out.println("The average IQ of the participatants is Extremely low");
		}
		else if ((70 <= average) && (average <= 79)) {
			System.out.println("The average IQ of the participatants is Boarderline");
		}
		else if ((80 <= average) && (average <= 89)) {
			System.out.println("The average IQ of the participatants is Low Average");
		}
		else if ((90 <= average) && (average <= 109)) {
			System.out.println("The average IQ of the participatants is Average");
		}
		else if ((110 <= average) && (average <= 119)) {
			System.out.println("The average IQ of the participatants is High Average");
		}
		else if ((120 <= average) && (average <= 129)) {
			System.out.println("The average IQ of the participatants is Superior");
		}
		else if (average <= 130) {
			System.out.println("The average IQ of the participatants is Very Superior");
		}
		
		input.close();
	}
	
}
