/* 1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.
*/

Class PrimitiviteData{
	
	public static void main(String[] args) {
        // Byte
        byte byteDefault;
        byte byteAssigned = 10;

        System.out.println("Byte Default Value: " + byteDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Byte Assigned Value: " + byteAssigned);

        // Short
        short shortDefault;
        short shortAssigned = 20;

        System.out.println("Short Default Value: " + shortDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Short Assigned Value: " + shortAssigned);

        // Int
        int intDefault;
        int intAssigned = 30;

        System.out.println("Int Default Value: " + intDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Int Assigned Value: " + intAssigned);

        // Long
        long longDefault;
        long longAssigned = 40L;

        System.out.println("Long Default Value: " + longDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Long Assigned Value: " + longAssigned);

        // Float
        float floatDefault;
        float floatAssigned = 50.5f;

        System.out.println("Float Default Value: " + floatDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Float Assigned Value: " + floatAssigned);

        // Double
        double doubleDefault;
        double doubleAssigned = 60.6;

        System.out.println("Double Default Value: " + doubleDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Double Assigned Value: " + doubleAssigned);

        // Boolean
        boolean booleanDefault;
        boolean booleanAssigned = true;

        System.out.println("Boolean Default Value: " + booleanDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Boolean Assigned Value: " + booleanAssigned);

        // Char
        char charDefault;
        char charAssigned = 'A';

        System.out.println("Char Default Value: " + charDefault); // This will throw an error because local variables are not initialized by default
        System.out.println("Char Assigned Value: " + charAssigned);
   
}
}