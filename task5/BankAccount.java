package part3.task5;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;//余额不能被外部代码随意直接修改。
    private String password;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.password = password;
    }

    public void deposit(double amount) {
        //金额不能是负数或零。
        if(validateAmount(amount)) {
            this.balance += amount;  
        }
        else {
            System.out.println("金额要大于0");
            return;
        }
    }

    public boolean withdraw(double amount, String inputPassword) {
        //校验密码，同时保证金额不能是负数或零,并且余额不小于金额。
        if(validatePassword(inputPassword) && this.balance >= amount && validateAmount(amount)) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean transfer(BankAccount recipient, double amount, String inputPassword) {
        //校验密码，保证金额不能是负数或零,并且余额不小于金额，同时保证转账成功后，收款方的余额增加。
        if(this.withdraw(amount, inputPassword)) {
            recipient.deposit(amount);
            return true;
        }
        else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountInfo() {
        return "账号:" + this.accountNumber.substring(0,4) + "********" 
        +  ",账号持有人:" + this.accountHolder 
        + ",余额:" + this.balance
        + ",密码:" + "********" ;//敏感信息不被完整暴露出去。
    }

    // 只需修改可见性
    private boolean validatePassword(String inputPassword) {
        return true;
    }

    // 只需修改可见性
    private boolean validateAmount(double amount) {
        return true;
    }
}
