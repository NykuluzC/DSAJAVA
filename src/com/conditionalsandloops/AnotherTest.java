import java.util.Scanner;

public class AnotherTest{
public static void main(String[] args){
    System.out.print("Itteration of : ");
    Scanner in = new Scanner(System.in);
    int Iterration = in.nextInt();

    for(int i = 0; i < Iterration; i++){
      switch(i){
        case  0 -> System.out.println("Zero");
        case  1 -> System.out.println("One");
        case  2 -> System.out.println("Two");
        case  3 -> System.out.println("Three");
        case  4 -> System.out.println("Four");
        default -> System.out.println("Uninitialized"); 
        }  
    }
  }
}
