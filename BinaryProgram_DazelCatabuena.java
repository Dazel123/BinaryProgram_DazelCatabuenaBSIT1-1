package Catabuena;
import java.util.Scanner;

public class BinaryProgram {




  public static void main(String [] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Binary Program by Dazel Catabuena");
     
     System.out.println("Enter a 6 bit Binary Number:");
     String BinaryNumber=input.nextLine();
     
    int
   DecimalNumber=Integer.parseInt(BinaryNumber,2);
     System.out.println("Decimal number is:"+DecimalNumber);
   
  }
}