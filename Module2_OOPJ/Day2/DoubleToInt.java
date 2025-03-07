/* 3. Write a program to convert a double value to int using typecasting and explain the data loss. */


public class DoubleToInt {
    public static void main(String[] args) {

        double doubleValue = 10.99;

        int intValue = (int) doubleValue;

        System.out.println("Original Double Value: " + doubleValue);
        System.out.println("Converted Int Value: " + intValue);
		
		}
}

		
		/* explain the data loss : Data Loss Explanation
When we convert a double value to an integer using typecasting, we are essentially truncating the decimal part of the number. 
This can result in a loss of precision and accuracy, which can be significant in certain scenarios.

Examples of Data Loss
Financial Calculations: When calculating interest rates or investment returns, small rounding errors can accumulate and lead to incorrect results.
Scientific Calculations: When working with small values, truncation can affect the accuracy of calculations, leading to incorrect results.
GPS Coordinates: When converting GPS coordinates from decimal degrees to integer degrees, truncation can result in a loss of precision, 
leading to incorrect location calculations. */

    