public class Soda {
  String addition = "none";

  public Soda(String addition) {
    this.addition = addition;
  }

  public Soda() {
  }

  public String GetMyDrinkString(){
    return addition.equals("none")? "Обычная газировка":("Газировка и "+addition);
  }
}
