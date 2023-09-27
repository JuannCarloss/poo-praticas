package bank;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Integer accNumber, String accUser, Double firstDeposit, Double loanLimit) {
        super(accNumber, accUser, firstDeposit);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            accDeposit(amount);
        }


    }

}
