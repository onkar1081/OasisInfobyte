import java.util.Scanner;  
public class Main 
{  
    public static void main(String args[] )  
    {  
        int bal = 1000, wd, dep;  
        Scanner s = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("ATM Machine");  
            System.out.println("1 to Deposit");  
            System.out.println("2 to Withdraw");  
            System.out.println("3 to Check Balance");  
            System.out.println("4 to Exit");  
            System.out.print("Choose the operation\n");  
            int ch = s.nextInt();  
            switch(ch)  
            {  
                case 1:  
                    System.out.print("Enter money to be deposited\n");  
                    dep= s.nextInt();  
                    bal = bal + dep;  
                    System.out.println("Successfully depsited");  
                    System.out.println("");    
                    break;  
                case 2:  
                    System.out.print("Enter money to be withdrawn\n");  
                    wd= s.nextInt();  
                    if(bal>= wd)  
                    {  
                        bal = bal - wd;  
                        System.out.println("Please collect your money");  
                    }  
                    else  
                    {  
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");                       
                    break;  
                case 3:  
                    System.out.println("Balance : "+bal);  
                    System.out.println("");  
                    break;  
                case 4:  
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Select Correct Choice");
                
            }  
        }  
    }  
}  
