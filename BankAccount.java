public class BankAccount {
    private String accNo;
    private String owner;
    private double balance;
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccNo() {
        return accNo;
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    
    public void withdraw(double amt){
        if (amt<=this.balance){
            this.balance-=amt;
            System.out.println("withdrawed: balance left "+this.balance);
        }else{
            System.out.println("Failed: balance insufficient");
        }
    }

    public void deposit(double amt){
        this.balance+=amt;
    }
}
