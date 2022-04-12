package BankingSystem;

public class Transaction {
     public int addFunds(int transactionaAmount, int currentFund){

        return currentFund + transactionaAmount;
    }
    public int withdrawFunds(int transactionaAmount, int currentFund){

        return currentFund - transactionaAmount;
    }
    
    public double usdConverstion(int CurrentFund){

        return CurrentFund * 0.019;
    }
    public double yenConverstion(int CurrentFund){

        return CurrentFund * 2.41;
    }
    public double euroConverstion(int CurrentFund){

        return CurrentFund * 0.017;
    }


}
