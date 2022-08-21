package Bank.Java;

public class Cardholder {

    int id;
    String name;
    String passsword;
    boolean isActive;
    int balance;

    Cardholder(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.balance = 0;
        this.isActive = true;
    }
    
    Cardholder(int id, String name, int balance, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.isActive = true;
    }

    public void topUpBalance(int balance) {
        this.balance = this.balance + balance;
    }

    public void substractBalance(int substract) {
        this.balance = this.balance - substract;
    }

    public void setStatus(boolean status) {
        this.isActive = status;
    }

    public boolean getStatus() {
        return this.isActive;
    }
}
