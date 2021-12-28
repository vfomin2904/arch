package chain;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank(null, 16);
        Paypal paypal = new Paypal(bank, 13);

        paypal.pay(14);
    }
}
