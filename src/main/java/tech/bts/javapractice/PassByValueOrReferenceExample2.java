package tech.bts.javapractice;

public class PassByValueOrReferenceExample2 {

    public static void main(String[] args) {

        Calc calc = new Calc();
        calc.add(2);

        int n = 3;

        System.out.println("--- Initial values ---");
        System.out.println("n = " + n);
        System.out.println("calc.value = " + calc.getValue());

        modifyValues(calc, n);

        System.out.println("--- After modifying ---");
        System.out.println("n = " + n);
        System.out.println("calc.value = " + calc.getValue());

        modifyValuesAgain(calc, n);

        System.out.println("--- After modifying again ---");
        System.out.println("n = " + n);
        System.out.println("calc.value = " + calc.getValue());
    }

    private static void modifyValues(Calc c, int x) {

        c.add(x);

        x = x + 2;
    }

    private static void modifyValuesAgain(Calc c, int x) {

        c = new Calc();
        c.add(20);

        x = x + 2;
    }
}

class Calc {

    private int value;

    public Calc() {
        this.value = 0;
    }

    public void add(int x) {
        value += x;
    }

    public int getValue() {
        return value;
    }
}
