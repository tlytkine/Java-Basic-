import java.util.Scanner;
public class Sky {

  Scanner scnr = new Scanner(System.in);
  
  
  public static void main(String[]args) {
    
    Systen.out.println("Is the sky blue? - Enter yes or no.");
    String x = scnr.next();
    
    if(x=="yes"){
      System.out.println("Correct! Good job!.");
    }
    else {
      System.out.println("Wrong! The sky is blue!!!!!!!");
    }

  }
  

}
