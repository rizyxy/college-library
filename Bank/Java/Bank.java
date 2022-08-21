package Bank.Java;
import java.util.HashMap;


class Bank {

    String name;
    HashMap<Integer, Cardholder> cardholders;

    Bank() {
        this.name = name;
        this.cardholders = new HashMap<Integer, Cardholder>();
    }

    //This will register a new cardholder with name and password parameter
    void register(String name, String password) {
        this.cardholders.put(this.cardholders.size(), new Cardholder(this.cardholders.size(), name, password));
    }

    //This will register a new cardholder with name, balance, and password parameter
    void register(String name, int balance, String password) {
        this.cardholders.put(this.cardholders.size(), new Cardholder(this.cardholders.size(), name, balance, password));
    }

    //This will suspend a cardholder with particular id
    void suspendCardHolder(int id) {
        this.cardholders.get(id).setStatus(false);
    }

    //This will unsuspend a cardholder with particular id
    void unsuspendCardHolder(int id) {
        this.cardholders.get(id).setStatus(true);
    }

    //This will top up a cardholder's balance
    void topUpBalance(int id ,int balance) {
        this.cardholders.get(id).topUpBalance(balance);
    }

    //This will substract a cardholder's balance
    void substractBalance(int id ,int substract) {
        
        if (this.cardholders.get(id).balance >= substract) {
            this.cardholders.get(id).substractBalance(substract);
        } else {
            System.out.println("Balance Not Enough");
        }
    }

    //This will remove a cardholder from database
    void removeCardHolder(int id) {
        this.cardholders.remove(id);
    }

}