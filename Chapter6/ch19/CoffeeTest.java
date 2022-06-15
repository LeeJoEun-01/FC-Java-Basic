package ch19;

public class CoffeeTest {
  
  public static void main(String[] args) {
    
    Coffee ethiopiaCoffee = new EthiopiaAmericano();
    ethiopiaCoffee.brewing();

    System.out.println();
    Coffee ethioLatte = new Latte(ethiopiaCoffee);
    ethioLatte.brewing();

    System.out.println();
    Coffee mochaEtiCoffee = new Mocha(new Latte(new EthiopiaAmericano()));
    mochaEtiCoffee.brewing();

    System.out.println();
    Coffee KenyaCoffee = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
    KenyaCoffee.brewing();
  }
}
