public class Assignment1 {
    public static void main(String a[]) {
        int number1 = 5;
        int number2 = 3;

        System.out.println("NUMBER 1: Write a Java program to swap 2 numbers.");
        System.out.println("Initial values: ");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        System.out.println(" ");

        int temporary = number1;
        number1 = number2;
        number2 = temporary;

        System.out.println("After swap: ");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        System.out.println("-----------");

        System.out.println(" ");

        System.out.println("NUMBER 2: Write a Java program to find the largest of 3 numbers.");
        int num1 = 3;
        int num2 = 7;
        int num3 = 1;

        int maximum = num1;

        if (num2 > maximum) {
            maximum = num2;
        }

        if (num3 > maximum) {
            maximum = num3;
        }

        System.out.println("The largest of the 3 numbers is: " + maximum);

        System.out.println("-----------");

        System.out.println(" ");

        System.out.println("NUMBER 3: Write a Java program to find the factorial of a number.");
        int number = 3;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);

        System.out.println("-----------");

        System.out.println(" ");

        System.out.println("NUMBER 4: Write a java program to count the number of digits in a number.");
        int num = -543210;
        int count = 0;

        num = Math.abs(num);

        String numberString = Integer.toString(num);
        count = numberString.length();

        System.out.println("The number of digits is: " + count);

        System.out.println("-----------");

        System.out.println(" ");

        System.out.println("NUMBER 5: Write a java program to count the number of even and odd digits in a number.");
        int digits = 12345;
        int evenCount = 0;
        int oddCount = 0;

        number = Math.abs(digits);

        String numString = Integer.toString(digits);

        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);

        System.out.println("-----------");

        System.out.println(" ");

        System.out.println("NUMBER 6: Write a java program to find the sum of elements in an array.");
        int[] array = {1, 2, 3, 4, 5, 6};
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }

        System.out.println("The sum of the numbers in the array is: " + arraySum);


    }
}