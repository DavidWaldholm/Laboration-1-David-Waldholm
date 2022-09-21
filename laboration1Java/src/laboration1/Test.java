package laboration1;

import java.util.*;


public class Test {
    static Scanner sc = new Scanner(System.in);

    static void test() {

        //List<int[]> list = new ArrayList<>();//create a list or arrays

        //for (int i = 0; i < 5; i++) {
        /*System.out.println("Skriv hur många nummer du vill ha i arrayen");
        int variable = sc.nextInt();
        int[] array = new int[variable];*/
        int[] array = new int[5];

        int max = array[0];
        int min = Integer.MAX_VALUE;
        int min2nd = Integer.MAX_VALUE;
        //System.out.println(min + "  " + min2nd);
        //for (int i = 0; i < variable; i++) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] < min) { //if 12 < 23
                min = array[i]; //min = 12
                min2nd = array[i];


            } else if (array[i] < min2nd && array[i] != min) {
                min2nd = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

       /* for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
        min = Math.min(min, array[i]);
        min2nd = Math.min(min2nd, array[i+1]);
        max = Math.max(max, array[i]);
    }*/

        //list.add(array);//add your array to your list
        System.out.println(Arrays.toString(array));
        System.out.println("Min value: " + min + "\nMax value: " + max + "\n");
        System.out.println("2nd min: " + min2nd);
        //}
    }

    static void test2() {
        ArrayList<Integer> minAndMaxList = new ArrayList<>();
        System.out.println("Please write numbers, they will write out the Minimum, Maximum , Sum: ");
        String writer = sc.nextLine();

        System.out.println("\n" + writer);

        String[] split = writer.split(" ");
        for (String a : split) {
            minAndMaxList.add(Integer.parseInt(a));
        }
        int sum = 0;
        for (Integer integer : minAndMaxList) {
            sum += integer;
        }

        Collections.sort(minAndMaxList);

        System.out.println("Second Max value: " + minAndMaxList.get(minAndMaxList.size() - 2));
        System.out.println("Second Min value: " + minAndMaxList.get(1));
        int min = Collections.min(minAndMaxList);
        int max = Collections.max(minAndMaxList);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Sum: " + sum);
    }

    static void test3() {
        ArrayList<Integer> cars = new ArrayList<>();
        String items = sc.nextLine();
        String[] split = items.split(" ");

        for (String a : split) {
            cars.add(Integer.parseInt(a));
        }
        System.out.println(items);

    }

    static void test4() {
        {
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

            System.out.println("\n" + Arrays.toString(integers));
            System.out.println("\nStörsta talet: " + integers[integers.length - 1]);
            System.out.println("Minsta talet: " + integers[0]);

            if (inOrder.equalsIgnoreCase("Yes")) {
                System.out.println("Arrayen är  i ordning\n");
            } else if (inOrder.equalsIgnoreCase("No")) {
                System.out.println("Arrayen är inte i ordning\n");
            }
            //System.out.println("Näst Största talet: " + integers[integers.length - 2]);//kopiera för "ordning och reda"
            //System.out.println("Näst Minsta talet: " + integers[1]);


        }
    }

    static void test5() {
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

}

