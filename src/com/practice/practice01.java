import java.util.Scanner;
public class practice01{
  public static void main(String[] args){
    // 1 Tim 4:12
    
    //flags
    boolean isResponsible;
    boolean isDisciplined;
    boolean isLivingInTruth;
    
    //Header
    String verse = "1 Tim 4:12";
    System.out.println("Today's Verse: " + verse);
    
    Scanner in = new Scanner(System.in);
    System.out.println("\t\t\t\t ***** (1) Yes, (2) No *****");
    System.out.print("Are you Responsible ? : "); 
    int Decision0 = in.nextInt(); 
    System.out.print("Are you Disciplined ? : ");
    int Decision1 = in.nextInt();
    System.out.print("Are you Living with the Truth ? : ");
    int Decision2 = in.nextInt();

    if(Decision0 == 1 &&  Decision1 == 1 && Decision2 == 1){
        System.out.println("Godbless 🙏🏻");
    } else {
        System.out.println("May God Guide You for the better life");
    }




    
  }
}
