package laboration1;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        //Test.test();
        //Test.test2();
        //Test.test3();
        //Test.test4();
        //Test.test5();
        while (true) {
            String choice = showMenu();
            switch (choice) {
                case "1" -> Methods.uppOchNer();
                case "2" -> Methods.minMax();
                case "3" -> Methods.stenSaxPåse();
                case "4" -> Methods.ordningOchReda();
                case "e", "E" -> {
                    System.out.println("Programmet avslutas...");
                    System.exit(0);
                }
            }

        }
    }

    //meny
    private static String showMenu() {
        System.out.println("""
                
                1. Upp och ner
                2. Min Max
                3. Sten sax påse
                4. Ordning och reda
                e. Avsluta
                """);
        String alternative = sc.nextLine();
        return alternative;

    }
}
