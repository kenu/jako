public class Condition {
  public static void main(String[] args) {
    String[] fruits = {"apple", "banana", "orange"};
    for (String fruit : fruits) {
      if (fruit.equals("banana")) {
        break;
      }
      System.out.println(fruit);
    }
  }
}
