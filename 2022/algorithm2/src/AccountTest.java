public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while (a.transfer(b, 3000)) {
            ;
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}

class Account {
    private String num;
    private int balance;

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account account, int balance) {
        if (this.balance - balance >= 0) {
            this.balance -= balance;
            account.setBalance(account.getBalance() + balance);
            return true;
        }
        return false;
    }

    public String getNum() {
        return num;
    }

    public int getBalance() {
        return balance;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toStr() {
        return "Account{" +
               "num: '" + num + '\'' +
               ", balance: " + balance +
               '}';
    }
}
