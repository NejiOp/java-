//Encapsulation
class BankAccount {

    private int accountNumber;
    private int balance;

    public void setAccountNumber(int a){
        accountNumber = a;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(int b){
        if(b >= 0){
            balance = b;
        } else {
            System.out.println("Invalid balance amount");
        }
    }

    public int getBalance(){
        return balance;
    }
}

public class Day9 {
    public static void main(String[] args){

        BankAccount acc = new BankAccount();

        acc.setAccountNumber(376733333);
        acc.setBalance(3000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}