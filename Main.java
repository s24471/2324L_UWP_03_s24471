import java.util.Scanner;
import java.util.*;

public class Main {
    static String name;
    static String surrname;
    static int age;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("provide age");
        age = Integer.parseInt(s.nextLine());
        System.out.println("privde name and surrname");
        name = s.nextLine();

        System.out.println(age);
        System.out.println(name);
        System.out.println(surrname);
    }
}