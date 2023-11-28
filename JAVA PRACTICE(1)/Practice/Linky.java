import java.util.ArrayList;
import java.util.Scanner; 

public class Linky {
  
   public static void main(String[] args) {

      ArrayList<String> cannedList = new ArrayList<String>();
        
      cannedList.add("Marcus");
      cannedList.add("Ange");
      cannedList.add("Pattung");
      cannedList.add("Cal");
      cannedList.add("HatdogMalaki");

      System.out.println(cannedList);

      Scanner qz = new Scanner(System.in);
        int num; 
      
      System.out.println("Choose a number between 0 to 4: ");
      num = qz.nextInt();

      try {
         System.out.print(cannedList.get(num));
      }
      catch(IndexOutOfBoundsException e) {
         System.out.println("Invalid Input. This program has been terminated.");
      }   
   }
}