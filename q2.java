// Write a Java program that take a input and detect whether there’s integer in
// there.
// Example: input value “45222” return true, input value “This Is A Test4me” return
// true, input value “IAMGOOD” return false

import java.util.Scanner;

public class q2 {

    public static boolean noIntegers(String input) {
        Boolean flag = true;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();

        if (noIntegers(input)) {
            System.out.println(String.format("The input \"%s\" is valid -- true", input));
        }

        else {
            System.out.println(String.format("The input \"%s\" is invalid -- false", input));
        }
        
        scanner.close();
    }
}