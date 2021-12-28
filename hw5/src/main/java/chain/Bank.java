package chain;

public class Bank extends Account{
    public Bank(Account next, int cash) {
        this.next = next;
        this.cash = cash;
    }
}
