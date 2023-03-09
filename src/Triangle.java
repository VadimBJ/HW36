public class Triangle {
  int sideA;
  int sideB;
  int sideC;

  public Triangle(int sideA, int sideB, int sideC) {
    if (sideA > 0 && sideB > 0 && sideC > 0 && checkSides(sideA, sideB, sideC)) {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
    } else {
      System.out.println("Fail to create a triangle");
    }
  }

  public static boolean checkSides(int a, int b, int c) {
    return a < (b + c) && b < (a + c) && c < (a + b);
  }
}
