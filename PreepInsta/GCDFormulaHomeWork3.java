/* Problem 3

Recursive program to print formula for GCD of n integers

Given a function gcd(a, b) to find GCD (Greatest Common Divisor) of two number. 
It is also known that GCD of three elements can be found by gcd(a, gcd(b, c)),
 similarly for four element it can find the GCD by gcd(a, gcd(b, gcd(c, d))). 
 Given a positive integer n. The task is to print the formula to find the GCD of n integer using given gcd() function. Examples:

Input: n = 3

Output: gcd(int, gcd(int, int))

Input: n = 5

Output: gcd(int, gcd(int, gcd(int, gcd(int, int)))) */

import java.util.Scanner;

public class GCDFormulaHomeWork3{

  //Recursive function to generate GCD fromula
  
  public static String generateGCDFormula(int n) {
  //Base case: if n == 2, return the simplest formula
  if(n == 2){
  return "GCD(int, int)";
  }
  
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
	  
	  //Take user input for new
	  System.out.print("Enter the number of integers (n): ");
	  int n = scanner.nextInt();
	  
	  //condition chek: GCD formula makes sense for n >= 2
	  if(n < 2) {
	       System.out.println(generateGCDFormula(n));
		}
		
		scanner.close();
		
		}
		
	}
  
  

