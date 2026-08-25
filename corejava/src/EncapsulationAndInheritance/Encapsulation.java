class BankAccount{
    private double balance;

    public void deposite(int ammount){
        balance+=ammount;
    }

    public void withdraw(int ammount){
        balance-=ammount;
    }

    public double getBalance(){
        return balance;
    }
}

class Encapsulation{
    /*Encapsulation helps us in validation and direct access */
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount();
        acc.deposite(10000);
        System.out.println(acc.getBalance());
    }
}