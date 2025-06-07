

class BankAccounts {
    private String accountNumber;
    private double balance;
    public BankAccounts (String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
class SavingAccount extends BankAccounts{
    private double interestRate;
    public SavingAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;

    }
    public double interest(){
        return (getBalance())* interestRate/ 100;
    }


    }   

}
public class CW1{
    public static void main(String[] args) {
        SavingAccount c= new SavingAccount("12344567",12343445.5,12);
        System.out.println("initial balance"+c.getBalance());
        System.out.println("Interest Earned: " + c.interest());
        
        // Update balance
        c.setBalance(1200.0);
        System.out.println("Updated Balance: " + c.getBalance());
        System.out.println("Interest Earned after update: " + c.interest());

    }


}