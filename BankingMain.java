package BankingSystem;
import java.util.Scanner;
public class BankingMain {
  
    public static void main(String[] args) {
        
        int option,option2,currentFund,transactionaAmount, initialfunds;
        String name;
        double convertion;
        Scanner inputsc = new Scanner(System.in);
        Transaction transaction = new Transaction();
        
        

        System.out.println("Enter Your Name: ");
        name = inputsc.nextLine();
        
        System.out.println("Enter Your Intial funds: ");
        initialfunds = inputsc.nextInt();
        currentFund = initialfunds;

        do{
            System.out.println("________________________________");
            System.out.println("Press [1] to Display information");
            System.out.println("Press [2] to Add Funds");
            System.out.println("Press [3] to Withdraw your Funds");
            System.out.println("Press [4] to Covert your funds to USD");
            System.out.println("Press [0] to End: ");
            System.out.println("________________________________");
            option = inputsc.nextInt();
           


            if(option==1){
                System.out.println("********************************");
                System.out.println("Your Information Details");
                System.out.println("Name: " + name);
                System.out.println("Your Current Funds: " + currentFund);
                System.out.println("********************************");

            }else if(option == 2){
                System.out.println("********************************");
                System.out.println("ADD Funds");
                System.out.println("Your Current Funds: " + currentFund);
                System.out.println("Input your Additional Funds");
                transactionaAmount = inputsc.nextInt();
                if(transactionaAmount < 500 ){
                        System.out.println("Invalid Input please input above 500 amount");
                }else{
                    currentFund = transaction.addFunds(transactionaAmount, initialfunds);
                System.out.println("Your Current Funds is: " + currentFund);
                System.out.println("********************************");
                }


            } else if(option == 3){
                System.out.println("********************************");
                System.out.println("Withdraw Funds");
                System.out.println("Your Current Funds: " + currentFund);
                System.out.println("Input your a amount you want to withdraw");
                transactionaAmount = inputsc.nextInt();
                if(transactionaAmount < 500 || transactionaAmount > currentFund){
                    System.out.println("Your Current Balance is not Enough or withdraw an amount that is greater than 500");
                 }else{
                currentFund = transaction.withdrawFunds(transactionaAmount, initialfunds);
                System.out.println("Your Current Funds is: " + currentFund);
                System.out.println("********************************");
                }
            }
            else if(option == 4){
                
                System.out.println("********************************");
                System.out.println("Convert your Funds");
                System.out.println("Your Current Funds: " + initialfunds);
                System.out.println("Press [1] to convert your funds to USD: ");
                System.out.println("Press [2] to convert your funds to YEN: ");
                System.out.println("Press [3] to convert your funds to EURO: ");
                option2 = inputsc.nextInt();
                
                switch (option2) {
                    case 1: System.out.println("********************************");
                            System.out.println("Your Funds to USD");
                            convertion = transaction.usdConverstion(currentFund);
                            System.out.println(currentFund+" Pesos = "+convertion+" USD");
                            break;
                    case 2: System.out.println("********************************");
                            System.out.println("Your Funds to YEN");
                            convertion = transaction.yenConverstion(currentFund);
                            System.out.println(currentFund+" Pesos = "+convertion+" YEN");
                            break;
                    case 3: System.out.println("********************************");
                            System.out.println("Your Funds to EURO");
                            convertion = transaction.euroConverstion(currentFund);
                            System.out.println(currentFund+" Pesos = "+convertion+" EURO");
                            break;   

                        
                    default: System.out.println("********************************");
                             System.out.println("Invalid Input Pleased input Valid Number");

                        break;
                }
                System.out.println("********************************");
               
            }
                
        else{
                System.out.println("Invalid Input please input again");
            }
        }
        while(option != 0 );
            System.out.println("Program End Thank you!!");
       inputsc.close();
        }
      }
            
       



        








