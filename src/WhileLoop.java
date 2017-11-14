
import java.util.Scanner;

    public class WhileLoop {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number to find the factorial of it");

            int number = input.nextInt();

            int factor = 1;

            for (int i = 1; i <= number; i++) {
                factor = factor * i;
            }

            System.out.println(factor);
        }
    }