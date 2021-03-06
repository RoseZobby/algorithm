package com.dr.mandingo.projecteuler;

/**
 * Even Fibonacci numbers
 * 
 * ============================================================================
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * Answer: 4613732
 */
public class Problem002 {

	public static void main(String[] args) {
		int sum = 0;
		int preValue = 1;
		int posValue = 2;
		while (posValue < 4000000) {
			if (posValue % 2 == 0) {
				sum += posValue;
			}
			int temp = preValue + posValue;
			preValue = posValue;
			posValue = temp;
		}
		System.out.print("the final result is:" + sum);
	}

}
