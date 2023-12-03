package collectiondemo;

public class Bank {
    int bankId;
    String bankName;

    public Bank(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    @Override
    public int hashCode() {
        return this.bankId*122;
    }

    @Override
    public boolean equals(Object obj) {
            Bank bank=(Bank)obj;
           return this.bankId==bank.bankId;
    }

    @Override
    public String toString() {
        return bankId+" "+bankName;
    }
}
