package chain;

public class Paypal extends Account{
    public Paypal(Account next, int cash) {
        this.next = next;
        this.cash = cash;
    }
}
