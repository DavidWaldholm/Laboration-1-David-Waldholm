package laboration1;

import java.util.*;

public class Methods {
    static Scanner sc = new Scanner(System.in);

    static void uppOchNer() {
        System.out.println("How many words do you want to write? (Max 10 words)");

        int listCount = sc.nextInt();
        if (listCount>10){
            System.out.println("Because you wrote more than 10, the amount is set to ten");
            listCount =10;
        }
        String wordList[] = new String[listCount];
        sc.nextLine();
        System.out.println("Write each word: ");

        for (int i = 0; i < wordList.length; i++) {
            System.out.println(i);
            wordList[i] = sc.nextLine();

            if (i == wordList.length - 1) {
                System.out.println("\n");
                for (int j = 0; j < wordList.length; j++) {
                    System.out.println(wordList[j]);
                }
                System.out.println("End");
                for (int n = wordList.length - 1; n >= 0; n--) {
                    System.out.println(wordList[n]);
                }
            }

        }


    }


    static void minMax() {

        int tempInt;
        String inOrder = null;
        System.out.println("Skriv in 5 heltal: ");

        int integers[] = new int[5];

        for (int i = 0; i < integers.length; i++) {     //length = 5 just nu
            integers[i] = sc.nextInt();
        }

        for (int i = 0; i < integers.length; i++) {

            for (int j = i + 1; j < integers.length; j++) {

                if (integers[i] > integers[j]) {
                    tempInt = integers[i];
                    integers[i] = integers[j];
                    integers[j] = tempInt;
                }
            }
        }

        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] > integers[i + 1]) {
                inOrder = "No";
            } else if (integers[i] < integers[i + 1]) {
                inOrder = "Yes";
            }
        }

        System.out.println("\nStörsta talet: " + integers[integers.length - 1]);
        System.out.println("Minsta talet: " + integers[0]);


    }

    static void stenSaxPåse() {
        int myScore = 0;
        int aiScore = 0;
        while (true) {
            System.out.println("Vad väljer du?\n1. Sten\t2. Sax \t3. Påse");
            int material = sc.nextInt();
            sc.nextLine();
            Random random = new Random();
            int slump = random.nextInt(1, 4);
            System.out.println(slump);
            switch (material) {
                case 1 -> {

                    if (slump == 1) {
                        System.out.println("Datorn fick sten\nOavgjort...");
                    } else if (slump == 2) {
                        System.out.println("Datorn fick sax\nDu vann rundan!");
                        myScore++;

                    } else if (slump == 3) {
                        System.out.println("Datorn fick påse\nDu förlorade...");
                        aiScore++;
                    }
                }
                case 2 -> {
                    if (slump == 1) {
                        System.out.println("Datorn fick sten\nDu förlorade...");
                        aiScore++;
                    } else if (slump == 2) {
                        System.out.println("Datorn fick sax\nOavgjort...");

                    } else if (slump == 3) {
                        System.out.println("Datorn fick påse\nDu vann rundan!");
                        myScore++;
                    }
                }
                case 3 -> {
                    if (slump == 1) {
                        System.out.println("Datorn fick sten\nDu vann rundan!");
                        myScore++;
                    } else if (slump == 2) {
                        System.out.println("Datorn fick sax\nDu förlorade...");
                        aiScore++;
                    } else if (slump == 3) {
                        System.out.println("Datorn fick påse\nOavgjort...");
                    }
                }
                default -> {
                    System.out.println("Välj 1, 2 eller 3");
                }

            }
            System.out.println("Dina poäng " + myScore + "\tDatorns poäng: " + aiScore);
            if (myScore == 3) {
                System.out.println("Du vann spelet\n");
                break;

            } else if (aiScore == 3) {
                System.out.println("Du förlorade spelet\n");
                break;

            }
        }
    }

    static void ordningOchReda() {

        int tempInt;
        String inOrder = null;
        System.out.println("Skriv in 5 heltal: ");

        int integers[] = new int[5];
        int sumOfAll = 0;
        for (int i = 0; i < integers.length; i++) {     //length = 5 just nu
            integers[i] = sc.nextInt();
        }

        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] > integers[j]) {
                    tempInt = integers[i];
                    integers[i] = integers[j];
                    integers[j] = tempInt;

                }
            }
        }

        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] > integers[i + 1]) {
                inOrder = "No";
            } else if (integers[i] < integers[i + 1]) {
                inOrder = "Yes";
            }
        }

        System.out.println("\n" + Arrays.toString(integers));
        System.out.println("\nStörsta talet: " + integers[integers.length - 1]);
        System.out.println("Minsta talet: " + integers[0]);
        System.out.println("Näst Största talet: " + integers[integers.length - 2]);
        System.out.println("Näst Minsta talet: " + integers[1]);
        System.out.println("Summa av talen: " + sumOfAll);

        if (inOrder.equalsIgnoreCase("Yes")) {
            System.out.println("Arrayen är  i ordning\n");
        } else if (inOrder.equalsIgnoreCase("No")) {
            System.out.println("Arrayen är inte i ordning\n");
        }

    }
}
