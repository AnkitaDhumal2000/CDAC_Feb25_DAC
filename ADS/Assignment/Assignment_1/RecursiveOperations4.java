/* Problem 	 
Write a recursive program that performs the following operations: 
1.	Check if a number is prime using recursion. 
2.	Check whether a given string is a palindrome. 
3.	Find the sum of digits of a given number. 
4.	Calculate the nth Fibonacci number. 
5.	Calculate a raised to the power b 
Input: 
num = 7  str = "racecar"   num = 1234   fibIndex = 6 a = 2, b = 5 
Output: 
Is prime: true 
Is 'racecar' a palindrome? true   
Sum of digits of 1234: 10   
Fibonacci(6): 8 
2^5 = 32 
Constraints: 
●	Do not use loops or built-in reverse methods. 
●	Use charAt() for string access. 
●	You can assume valid positive integer inputs. */
 
 
class RecursiveOperations4{

    // 1. Check if a number is prime using recursion
    public static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor == 1) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor - 1);
    }

    public static boolean isPrime(int num) {
        return isPrime(num, num / 2);
    }

    // 2. Check whether a given string is a palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    // 3. Find the sum of digits of a given number
    public static int sumOfDigits(int num) {
        if (num == 0) return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }

    // 4. Calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 5. Calculate a raised to the power b
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int num = 7;
        String str = "racecar";
        int sumNum = 1234;
        int fibIndex = 6;
        int a = 2, b = 5;

        System.out.println("Is prime: " + isPrime(num));
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str));
        System.out.println("Sum of digits of " + sumNum + ": " + sumOfDigits(sumNum));
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}

 
 
