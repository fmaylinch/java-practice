package tech.bts.javapractice;

public class StaticFieldExample {

    public static void main(String[] args) {

        // A static fields are shared by all instances.
        // Actually, static fields exist before you even create objects.
        // We can print it before creating calculators.
        System.out.println(Calculator.getNumOps());

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.add(5);
        c1.add(3);
        c2.add(7);

        // We get a field from calculator c1
        System.out.println(c1.getTotal());

        // We get the static field numOps
        System.out.println(Calculator.getNumOps());
    }
}

// Note: usually each class is written in a different file,
//       but for simplicity I write the Calculator class here.
class Calculator {

    static int numOps = 0;

    int total;

    public Calculator() {
        total = 0;
    }

    public static int getNumOps() {
        return numOps;
    }

    public int getTotal() {
        return total;
    }

    public void add(int amount) {
        total += amount;
        numOps++;
    }
}
