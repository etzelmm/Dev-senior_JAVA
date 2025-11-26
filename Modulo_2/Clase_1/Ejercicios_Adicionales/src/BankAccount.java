public class BankAccount {
    //atributes
    private String accountNumber;
    private String holderName;
    private Double amount;
    
    //constructors
    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    public BankAccount(String accountNumber, String holderName, Double amount) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.amount = amount;
    }

    //getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getAmount() {
        return amount;
    }

    //methods
    public void deposit(Double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Deposito no valido");
        } else {
            amount = depositAmount + amount;
        }
    }

    public void withdrawal(Double withdrawalAmount) {
        if (withdrawalAmount <= 0 || withdrawalAmount > amount) {
            System.out.println("retiro no valido");
        } else {
            amount = amount - withdrawalAmount;
        }
    }

    public void seeInfomation() {
        System.out.println(String.format("Cuenta bancaria= [Numero: %s, Titular: %s, Saldo: %s ]", 
        accountNumber, holderName, amount.toString()));
    }
    
}
