public class RealRationalTester {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(0.0);
    RealNumber b = new RealNumber(1.0);
    RealNumber c = new RealNumber(1.000009);
    RationalNumber d = new RationalNumber(1,0);
    RationalNumber e = new RationalNumber(1,2);
    RationalNumber f = new RationalNumber(2,-1);
    RationalNumber g = new RationalNumber(1,2);
    RationalNumber h = new RationalNumber(50,25);
    RationalNumber i = new RationalNumber(6,1);
    RationalNumber j = new RationalNumber(3,1);
    RationalNumber k = new RationalNumber(21,65);
    RationalNumber l = new RationalNumber(42,5);

    System.out.println("RealNumber tests:");
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


    System.out.println();
    System.out.println("RationalNumber tests:");
    System.out.println("getValue tests:");
    System.out.println("Expected Result: 0.0");
    System.out.print("Result: ");
    System.out.println(d.getValue());
    System.out.println("Expected Result: 0.5");
    System.out.print("Result: ");
    System.out.println(e.getValue());
    System.out.println("Expected Result: -2.0");
    System.out.print("Result: ");
    System.out.println(f.getValue());

    System.out.println();
    System.out.println("getNumerator tests:");
    System.out.println("Expected Result: 0");
    System.out.print("Result: ");
    System.out.println(d.getNumerator());
    System.out.println("Expected Result: 1");
    System.out.print("Result: ");
    System.out.println(e.getNumerator());
    System.out.println("Expected Result: -2");
    System.out.print("Result: ");
    System.out.println(f.getNumerator());

    System.out.println();
    System.out.println("getDenominator tests:");
    System.out.println("Expected Result: 1");
    System.out.print("Result: ");
    System.out.println(d.getDenominator());
    System.out.println("Expected Result: 2");
    System.out.print("Result: ");
    System.out.println(e.getDenominator());
    System.out.println("Expected Result: 1");
    System.out.print("Result: ");
    System.out.println(f.getDenominator());

    System.out.println();
    System.out.println("reciprocal & toString tests:");
    System.out.println("Expected Result: 0");
    System.out.print("Result: ");
    System.out.println(d.reciprocal());
    System.out.println("Expected Result: 2");
    System.out.print("Result: ");
    System.out.println(e.reciprocal());
    System.out.println("Expected Result: -1/2");
    System.out.print("Result: ");
    System.out.println(f.reciprocal());

    System.out.println();
    System.out.println("equals tests:");
    System.out.println("Expected Result: true");
    System.out.print("Result: ");
    e.reciprocal();
    System.out.println(g.equals(e));
    System.out.println("Expected Result: false");
    System.out.print("Result: ");
    f.reciprocal();
    d.reciprocal();
    System.out.println(f.equals(d));

    System.out.println();
    System.out.println("reduce test:");
    System.out.println("Expected Result: 2");
    System.out.print("Result: ");
    System.out.println(h);

    System.out.println();
    System.out.println("multiply, divide tests:");
    System.out.println("Expected Result: -1");
    System.out.print("Result: ");
    System.out.println(e.multiply(f));
    System.out.println("Expected Result: 2");
    System.out.print("Result: ");
    System.out.println(i.divide(j));

    System.out.println();
    System.out.println("add, subtract tests:");
    System.out.println("Expected Result: 9");
    System.out.print("Result: ");
    System.out.println(j.add(i));
    System.out.println("Expected Result: 3");
    System.out.print("Result: ");
    System.out.println(i.subtract(j));
    System.out.println("Expected Result: -105/13");
    System.out.print("Result: ");
    System.out.println(k.subtract(l));

  }
}
