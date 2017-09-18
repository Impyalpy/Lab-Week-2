
package labweek2;

import java.util.Scanner;

/**
 *
 * @author Conor
 */
public class LabWeek2 {
    public static void main(String[] args)
    {
        
        String app1, app2, app3;             //String (word or sentence)     Integer=int (solid number)     Double (decimal number)
        
        
        Scanner keyboard = new Scanner(System.in);
                
        
        System.out.print("Please enter your first favourite app: ");
        app1 = keyboard.nextLine();
        
         System.out.print("Please enter your second favourite app: ");
        app2 = keyboard.nextLine();
        
         System.out.print("Please enter your third favourite app: ");
        app3 = keyboard.nextLine();
       
        System.out.printf("Your favourite apps are: " + app1 + "," + app2 + "," + app3);
        
   
        
        
        
    }
    
}



        

