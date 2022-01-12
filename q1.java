// Write a Java program that take a string input and convert it to an integer without
// using the build-in parse function.
// Example: input value “123”, convert it to an integer type with value 123

import java.util.Scanner;

public class q1 {
    
    public static int stringToInt(String input) {
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            result = result * 10 + input.charAt(i) - '0';
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();
        int inputToInt = stringToInt(input);
        
        if (inputToInt == (int) inputToInt) {
            System.out.println(String.format("The input \"%s\" is now an integer", inputToInt));
        }

        scanner.close();
    }
}
