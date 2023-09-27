package bank;

public class Account {
    private final Integer accNumber;
    private String accUser;
    private Double accBalance = 0.0;

    public Account(Integer accNumber, String accUser, Double firstDeposit) {
        this.accNumber = accNumber;
        this.accUser = accUser;
        accDeposit(firstDeposit);
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public String getAccUser() {
        return accUser;
    }

    public void setAccUser(String accUser) {
        this.accUser = accUser;
    }

    public Double getAccBalance() {
        return accBalance;
    }

    public void accDeposit(Double amount) {
        accBalance += amount;
    }

    public void accWithdraw(Double amount){
        accBalance -= amount + 5;
    }
}
