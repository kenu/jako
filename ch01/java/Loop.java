public class Loop {
  public static void main(String[] args) {
    String[] fruits = {"apple", "banana", "orange"};
    for (String fruit : fruits) {
      System.out.println(fruit);
    }
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }
  }
}
