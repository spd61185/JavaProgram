package com.program;

import java.util.Arrays;

public class PairsOfElementsInArray {
	public static void main(String[] args) {
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20, 2}, 10);
		findThePairs(new int[] { 2, 3, 4, -2, 6, 8, 9, 11 },6);
	}

	static void findThePairs(int inputArray[], int inputNumber)
	{
		//Sorting the given array

		Arrays.sort(inputArray);

		System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");

		//Initializing i to first index

		int i = 0;

		//Initializing j to last index

		int j = inputArray.length-1;

		//Till i crosses j, perform the following task

		while (i < j)
		{
			//If inputArray[i]+inputArray[j] is equal to inputNumber

			if(inputArray[i]+inputArray[j] == inputNumber)
			{
				//then Print inputArray[i] and inputArray[j]

				System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);

				//Increment i

				i++;

				//Decrement j

				j--;
			}

			//If inputArray[i]+inputArray[j] is smaller than inputNumber

			else if (inputArray[i]+inputArray[j] < inputNumber)
			{
				//then increment i

				i++;
			}

			//If inputArray[i]+inputArray[j] is greater than inputNumber

			else if (inputArray[i]+inputArray[j] > inputNumber)
			{
				//then decrement j

				j--;
			}
		}
	}
}
