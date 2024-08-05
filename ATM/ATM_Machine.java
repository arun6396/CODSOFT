package ATM;

public class ATM_Machine {
    public static void main(String[] args) {
      Bank bank = new Bank(1000.00);
      AtmInterface atm = new AtmInterface(bank);
      atm.display();
    }
}