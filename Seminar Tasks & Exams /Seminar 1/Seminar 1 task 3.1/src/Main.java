public class Main {
  public static void main (String [] args) {

    BankAccount Majdi = new BankAccount("37193649", 10, "Majdi Jagidar");
    BankAccount Ethan = new BankAccount("33585939", 50, "Ethan Humel");
    BankAccount Jacob = new BankAccount("19474849", 200, "Jacob Cohen");

    Ethan.transfer(Majdi, 50);
    Majdi.transfer(Jacob ,50);
    Majdi.getAccountInfo();
    Jacob.getAccountInfo();
    Ethan.getAccountInfo();
  }
}
