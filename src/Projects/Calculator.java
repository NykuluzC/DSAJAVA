package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean itterate;
        do
        {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\t\tWelcome to a simple calculator app");
            System.out.println("\n(A) for Addition ➕, (S) for Subtraction ➖, (M) for Multiplication ✖️, (D) for Division ➗, (R) for Modulo ");
            System.out.print("Choice: ");
            String choice = input.next();

            switch (choice.toUpperCase()) {

                case "A" -> System.out.print("Result value is : " + (valueNum('X') + valueNum('Y')));
                case "S" -> System.out.print("Result value is : " + (valueNum('X') - valueNum('Y')));
                case "M" -> System.out.print("Result value is : " + (valueNum('X') * valueNum('Y')));
                case "D" -> System.out.print("Result value is : " + (valueNum('X') / valueNum('Y')));
                case "R" -> System.out.print("Result value is : " + (valueNum('X') % valueNum('Y')));
                default -> System.out.print("Invalid Arithmetic Choice!");
            }
            System.out.println("\n\t\t\t\tDo you still want to use the program? ");
            System.out.print("\t\t\t\tType Yes if so, if not then type No: ");
            choice = input.next();

            if(choice.toUpperCase().equals("YES")){
                itterate = true;
                System.out.print("\033c");
            } else {
                itterate = false;
                System.out.print("\n\t\t\t\tThank you for using this program😗");
            }

        }while(itterate == true);
    }
    public static int valueNum(char value){
        Scanner input = new Scanner(System.in);
        System.out.print(value + " value : ");
        return input.nextInt();
    }
}
