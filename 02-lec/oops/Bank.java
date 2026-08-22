class Bank{
    int balance;
    public Bank(int b){
        this.balance = b;
    }
    public void showBalance(){
        System.err.println("Balance " + this.balance);
    }
    public void deposit(int amount){
        this.balance = this.balance + amount;
        System.err.println("Deposit Amount " + amount);
    }
    public void withdraw(int amount){
        this.balance = this.balance - amount - 50;
        System.err.println("Withdraw Amount " + amount);
        System.err.println("50 rupees deducted.");
    }
}

class HDFC extends Bank{
    public HDFC(int b){
        super(b);
    }
}

class SBI extends Bank{
    public SBI(int b){
    super(b);
    }
}
class Cash{
    public static void main(String[] args) {
        Bank acc1 = new Bank(1500);
        acc1.showBalance();
        acc1.deposit(500);
        acc1.showBalance();
        acc1.withdraw(200);
        acc1.showBalance();

        System.err.println("\nHDFC\n");
        HDFC acc2 = new HDFC(10000);
        acc2.showBalance();
        acc2.deposit(1500);
        acc2.showBalance();
    }
}