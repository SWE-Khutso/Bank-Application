/**
 *
 * @author Khutso Elias Langa
 */
import java.util.Scanner;

public class Bank_Application 
{        
   static Scanner input = new Scanner(System.in);
    private static String balance;
    private double amount;
    private double withdraw;
    
    
    //Show balance method !!!
    static void showBalance(double balance)
   {
        System.out.println("\nAccount Balance: R" + balance);
   }
   
    //deposit method !!!
   static double deposit()
   {
       
       System.out.println("Enter deposit");
       
       double amount;
       amount = input.nextDouble();
       
       if (amount <= 0) 
       {
           System.out.println("Amount can not be negative");    
       }
       else
       {
           System.out.println("deposit successful");
           System.out.println("Amount depositted: " + amount);
          
       }
       return amount;
       
   }
   
   //method of withdrawing
   static double withdraw(double balance)
   {
       System.out.println("Enter withdraw amount");
       
       double amount;
       
       amount = input.nextDouble();
        
       
       if (balance < amount) 
       {
           System.out.println("Insufficient funds");  
           return 0;
       }
       else
       {
           System.out.println("Withdraw successful");  
           
       }
       return amount;
       
   }
   
   //method of diplaying the exit message
   static void Display()
   {
       System.out.println("Thank you for using Codveda Bank");
       System.out.println("Enjoy your day !!!");
   }

   ///////////////////////////////////////////////////////////
   //------------------------------------------------------//
    public static void main(String[] args) 
    {
        
       double balance = 0;
        System.out.println("*Welcome to Codveda Bank*");
        
        boolean isRunning = true;
        while(isRunning){ 
            
        //Options to perform by the user
        //displays on screen/console
        System.out.println(" ");
        System.out.println("1. Show Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        
        //user choosing what choice to perform
        int choice;
        System.out.print("\nEnter choice: ");
        choice = input.nextInt();
       
        switch(choice)
        {
            //checking account balance
            case 1:
                System.out.println("Balance: " );
                showBalance(balance);
                break;
             
            //withdrawing funds from account    
            case 2:
             balance -= withdraw(balance);
                break;
            
            //depositing funds into account    
            case 3:
           balance += deposit();
                break;
             
                //diplayiing exit and thank you message
            case 4:
                Display();
                isRunning = false;
                break;
              
            //incase of false choice, displays this message and restart the choices    
            default:
                System.out.println("Enter correct choice");
                break;
                
        }
             
      }
   }

}
            