package bank;

public class User {
    private final Integer accountNumber;
    public String accountName;
    private Double accountBalance;

    public User(Integer accountNumber, String accountName, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double depositValue(Double value){
        return this.accountBalance += value;
    }

    public Double withdrawValue(Double value){
        return this.accountBalance = this.accountBalance - value - 5;
    }

    @Override
    public String toString() {
        return "Conta Bancária: " +
                "número da conta: " + accountNumber +
                ", nome da conta: " + accountName +
                ", saldo da conta: " + accountBalance;
    }
}
