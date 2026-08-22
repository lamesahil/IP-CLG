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
    }
    public void withdraw(int amount){
        this.balance = this.balance - amount;
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
    }
}