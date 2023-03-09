public class Main {
  public static void main(String[] args) {

    Soda soda = new Soda("малина");
    System.out.println(soda.GetMyDrinkString());

    Soda soda2 = new Soda();
    System.out.println(soda2.GetMyDrinkString());

  }
}