public class Finance {

    private int balance;
    private final int MAX_MONEY = Integer.MAX_VALUE;

    public Finance(int theBalance) {
        balance = theBalance;
    }

    /** Tells the system if the user is bankrupt: */
    public boolean isBankrupt() {
        if (balance > 0) {
            return false;
        } else {
            return true;
        }
    }

    /** Sets the balance for the user: */
    public void setBalance(int newBalance) {
        if (newBalance < MAX_MONEY) {
            balance = newBalance;
        }
    }

    /** Adds to the balance for the user: */
    public void addBalance(int addedBalance) {
        if (addedBalance < MAX_MONEY) {
            balance += addedBalance;
        }
    }

    /** Subtracts to the balance for the user: */
    public void loseBalance(int lostBalance) {
        balance -= lostBalance;
    }

    /** Returns the balance for the user: */
    public int getBalance() {
        return this.balance;
    }

    public String toString() {
        return balance + "";
    }
}

