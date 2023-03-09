public class Main {
  public static void main(String[] args) {

    Soda soda = new Soda("малина");
    System.out.println(soda.GetMyDrinkString());

    Soda soda2 = new Soda();
    System.out.println(soda2.GetMyDrinkString());

    Triangle triangle = new Triangle(5,6,7);
    Triangle triangle2 = new Triangle(5,16,7);

  }
}