import java.util.*;

public class FactorialCalculator {

    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
		
        System.out.println("<------ Factorial Calculator ------>");

        while (true) {
            long factorial = 1;

            System.out.print("Enter a postive integer: ");
            number = scan.nextInt();

            if (number >= 0) {
                System.out.print(number + "! = ");

                for (int i = 1; i <= number; ++i) {
                    factorial *= i;
                    System.out.print(i);

                    if (i < number) {
                        System.out.print(" * ");
                    }
                }

                System.out.println();
                System.out.println("The Factorial of " + number + " is: " + factorial);
                
            } else {
                System.out.println("Invalid input! Program stopped!");
                break;
            }
        }
    }
}
