package tech.bts.javapractice;

import java.util.*;

public class PassByValueOrReferenceExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Mary2");

        int n = 5;

        System.out.println("--- Initial values ---");
        System.out.println("n = " + n);
        System.out.println("names = " + names);

        modifyValues(names, n);

        System.out.println("--- After modifying ---");
        System.out.println("n = " + n);
        System.out.println("names = " + names);

        modifyValuesAgain(names, n);

        System.out.println("--- After modifying again ---");
        System.out.println("n = " + n);
        System.out.println("names = " + names);
    }

    private static void modifyValues(List<String> list, int x) {

        list.add("Alex");

        x = x + 2;
    }

    private static void modifyValuesAgain(List<String> list, int x) {

        list = new ArrayList<>();
        list.add("John");
        list.add("Susan");

        x = x + 2;
    }
}
