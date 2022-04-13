public class BankAccount {
    public double checkingBalance;
    public double savingsBalance;

    private static int numberOfAccounts;

    private static double totalAmountStored;

    public BankAccount() {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        totalAmountStored += checkingBalance;
        totalAmountStored += savingsBalance;
    }

    //Getters
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public double getTotalAmountStored() {
        return totalAmountStored;
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    //Methods
    public String depositMoney(double amount, String account) {
        if (account.equals("checking")){
            checkingBalance += amount;
            totalAmountStored += amount;
            return "Deposit Successful!";
        }
        else if (account.equals("savings")){
            savingsBalance += amount;
            totalAmountStored += amount;
            return "Deposit Successful!";
        }
        else {
            return "Error! Transaction Denied! Please Try Again!";
        }
    }
    public String withdrawMoney(double amount, String account) {
        if (account.equals("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalAmountStored -= amount;
            return "Withdrawl Successful!";
        }
        else if (account.equals("savings") && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalAmountStored -= amount;
            return "Withdrawl Successful!";
        }
        else {
            return "Insufficient Funds, Transaction Denied";
        }
    }
    public String getAccountInformation(String account) {
        if (account.equals("checking")) {
            return "Your total checking balance is: $" + checkingBalance;
        }
        else if (account.equals("savings")) {
            return "Your total savings balance is: $" + savingsBalance;
        }
        else {
            return "Error! Please re-insert your card and try again!";
        }
    }
}