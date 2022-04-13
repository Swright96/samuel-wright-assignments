public class TestBankAccount {
    public static void main(String[] args) {
        //Create Bank Account
        BankAccount account1 = new BankAccount();
        account1.checkingBalance = 200.00;
        account1.savingsBalance = 50.00;

        BankAccount account2 = new BankAccount();
        account2.checkingBalance = 5000.00;
        account2.savingsBalance = 0.00;

        BankAccount account3 = new BankAccount();
        account3.checkingBalance = 20.00;
        account3.savingsBalance = 124.50;

        //Deposits and Withdrawls
        System.out.println(account1.depositMoney(100.00, "checking"));
        System.out.println(account1.depositMoney(50.00, "savings"));
        System.out.println(account2.withdrawMoney(50001.00, "checking"));

        //Display Account Balances
        System.out.println(account1.getAccountInformation("checking"));
        System.out.println(account1.getAccountInformation("savings"));
        System.out.println(account2.getAccountInformation("checking"));
        System.out.println(account2.getAccountInformation("savings"));
        System.out.println(account3.getAccountInformation("checking"));
        System.out.println(account3.getAccountInformation("savings"));

        //Display Total Amount Stored in Bank Accounts
        
    }
}