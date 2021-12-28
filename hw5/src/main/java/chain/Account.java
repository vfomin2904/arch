package chain;

abstract class Account {

    protected Account next;
    protected int cash;

    public void pay(int amount) {
        if (canPay(amount)) {
            System.out.println("paid");
        } else if (next != null) {
            next.pay(amount);
        } else {
            System.out.println("Money not enough");
        }
    }

    public boolean canPay(int amount) {
        return amount <= cash;
    }
}
