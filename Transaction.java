package BankingSystem;

public class Transaction {
     public int addFunds(int transactionaAmount, int currentFund){

        return currentFund + transactionaAmount;
    }
    public int withdrawFunds(int transactionaAmount, int currentFund){

        return currentFund - transactionaAmount;
    }
    


}
