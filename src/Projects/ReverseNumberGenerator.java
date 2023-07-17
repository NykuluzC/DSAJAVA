package Projects;

import java.util.Scanner;

public class ReverseNumberGenerator {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\t\t\t\tNumber Reversal Program");
        System.out.print("Number: ");
        number = input.nextInt();

        int temp = 0;
        while(number > 0){

            temp = (temp * 10) + (number % 10);
            number /= 10;
        }
        System.out.println("Number Reversed: " + temp);

    }
}
