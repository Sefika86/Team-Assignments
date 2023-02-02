package weekly_assignments.week2;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class ThrowExceptions {
    public static void main(String[] args) throws IOException {


        //  Write a code that throws NullPointerException

        String string = null;
        try {
            System.out.println(string.substring(0, 3));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("NullPointerException");
        }

        System.out.println("----------------------------------------------------------------------");

        //Write a code that throws InputMismatchException

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        try {
            scan.nextInt();
        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("----------------------------------------------------------------------");

        //Write a code that throws DateTimeException

        try {
            LocalDate date = LocalDate.of(2023, 13, 25);
        } catch (Exception E) {
            E.printStackTrace();
        }

        System.out.println("----------------------------------------------------------------------");

        //todo: How to create multiple classes in a single class file?
/**
        //I can create multiple classes in a class file(look at the bottom)
        //There are no restrictions on the number of classes that can be present in one Java program.
        // But each Java program should have only one class declared with public access specifier.
        // There cannot be two public classes in a single Java program
 */



        //todo: How to find previous versions (old savings) of a file in IntelliJ?

//right click on intellij in any class--> local history --> show history

    }
}


class Test1 {

}

class Test2 {

}