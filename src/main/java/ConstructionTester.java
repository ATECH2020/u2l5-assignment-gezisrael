import java.util.Scanner;
 
public class ConstructionTester
{
   public static void main(String[] args)
   {
       double taxRate;
       int windows;
       int lumber;
       double total;
 
       Scanner scanner = new Scanner(System.in);
 
       System.out.println("Enter the sales tax rate: ");
       taxRate = scanner.nextDouble();
 
       System.out.println("How many boards do you need? ");
       lumber = scanner.nextInt();
 
       System.out.println("How many windows do you need? ");
       windows = scanner.nextInt();
 
 
       Construction build = new Construction(8.0, 11.0, taxRate);
 
       total = build.lumberCost(lumber) + build.windowCost(windows);
       double usergrandTotal = build.grandTotal(total);
 
       System.out.println("Total: " + total);
       System.out.print("Grand Total: " + usergrandTotal);
 
      
      
 
    
      
   }
}
 
