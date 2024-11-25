package JunitAssignment;

public class BankAccount {

     private double balance;
    
     
    BankAccount(double balance){
        this.balance=balance;
    }

    public double  addAmount(double depositAmount){

        balance =balance+depositAmount;

        return balance;
    }

    public double withdrawAmount(double withdrawamount){

        if(balance<withdrawamount){
            throw new InsufficientFundException("Insufficent Funds!!");

        }

        balance=balance-withdrawamount;

        return balance;

    }

    public double getBalance(){

        return balance;
    }

    
}

class InsufficientFundException extends RuntimeException{
    InsufficientFundException(String message){
        super(message);
    }
}
