public class RealRationalTester {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(0.0);
    RealNumber b = new RealNumber(1.0);
    RealNumber c = new RealNumber(1.000009);
    System.out.println("equals tests:");
    System.out.println("Expected Result: false");
    System.out.print("Result: ");
    System.out.println(a.equals(b));
    System.out.println("(Special Case) Expected Result: true");
    System.out.print("Result: ");
    System.out.println(a.equals(a));
    System.out.println("Expected Result: true");
    System.out.print("Result: ");
    System.out.println(b.equals(c));

    System.out.println();
    System.out.println("add tests:");
    System.out.println("Expected Result: 0.0");
    System.out.print("Result: ");
    System.out.println(a.add(a));
    System.out.println("Expected Result: 1.0");
    System.out.print("Result: ");
    System.out.println(b.add(a));
    System.out.println("Expected Result: 2.000009");
    System.out.print("Result: ");
    System.out.println(b.add(c));

    System.out.println();
    System.out.println("multiply tests:");
    System.out.println("Expected Result: 0.0");
    System.out.print("Result: ");
    System.out.println(a.multiply(a));
    System.out.println("Expected Result: 0.0");
    System.out.print("Result: ");
    System.out.println(a.multiply(b));
    System.out.println("Expected Result: 1.000009");
    System.out.print("Result: ");
    System.out.println(b.multiply(c));

    System.out.println();
    System.out.println("divide tests:");
    System.out.println("Expected Result: 0.0");
    System.out.print("Result: ");
    System.out.println(a.divide(b));
    System.out.println("Expected Result: 0.999991000...");
    System.out.print("Result: ");
    System.out.println(b.divide(c));

    System.out.println();
    System.out.println("subtract tests:");
    System.out.println("Expected Result: 0.0");
    System.out.print("Result: ");
    System.out.println(a.subtract(a));
    System.out.println("Expected Result: -1.0");
    System.out.print("Result: ");
    System.out.println(a.subtract(b));
    System.out.println("Expected Result: .000009");
    System.out.print("Result: ");
    System.out.println(c.subtract(b));
  }
}
