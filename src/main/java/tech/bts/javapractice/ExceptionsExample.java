package tech.bts.javapractice;

public class ExceptionsExample {

    public static void main(String[] args) {

        try {
            String name = findUsernameById(5);
            System.out.println("The user is " + name);
        } catch (RuntimeException ex) {
            System.out.println("The user doesn't exist");
            System.out.println(ex.getMessage());
        }
    }


    private static String findUsernameById(int id) {
        if (id == 1) {
            return "Peter";
        } else {
            throw new RuntimeException("User doesn't exist with id: " + id);
        }
    }
}
