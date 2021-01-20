import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //ex3_2_1();
        //ex3_2_2();
        //ex3_2_3();
        //ex3_2_4();
        //String name = "Ivan Ivanov";
        //String comparableName = "vovan ivanov";
        // 3_2_5
        //checkUserName(name,comparableName);
        //ex3_2_6(name, comparableName);
        //ex3_2_7(name, comparableName);
        //3_2_8  1.
        //System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        //3_2_8  2.
        /*Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        } */
        //3_2_8  3.
        /*Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }*/
        //3_2_8 4.

        Scanner scanner = new Scanner(System.in);
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            String number = scanner.nextLine();
            isCorrectNumber = checkNumber(number);
            if (!isCorrectNumber) {
                System.out.println("Введите корректный номер!");
            } else {
                System.out.println(formatNumber(number));
            }
        }
    }

    public static void ex3_2_1() {
        System.out.println("Sometimes".charAt(2));
    }

    public static void ex3_2_2() {
        String name = "Ivan Ivanov";
        String comparableName = "ivan ivanov";
        System.out.println(name.equals(comparableName));
    }

    public static void ex3_2_3() {
        String name = "Ivan Ivanov";
        String comparableName = "ivan ivanov";
        System.out.println(name.equalsIgnoreCase(comparableName));
    }

    public static void ex3_2_4() {
        String name = "Ivan Ivanov";
        String comparableName = "ivan ivanov";
        if (name.equalsIgnoreCase(comparableName)) {
            System.out.println("Choose another username");
        } else {
            System.out.println("Good name!");
        }
    }

    public static void checkUserName(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Choose another username");
        } else {
            System.out.println("Good name!");
        }
    }

    public static void ex3_2_6(String name1, String name2) {
        if (!name1.equalsIgnoreCase(name2)) {
            System.out.println("Good name!");
            System.out.println("The length of your name is " + name1.length());
        } else {
            System.out.println("Choose another username");
        }
    }

    public static void ex3_2_7(String name1, String name2) {
        if (!name1.equalsIgnoreCase(name2)) {
            System.out.println("Good name!");
            System.out.println("The length of your name is " + name1.length());
            System.out.println("The length of your name without space is " + (name1.replace(" ", "")).length());
        } else {
            System.out.println("Choose another username");
        }
    }

    private static String removeWhiteSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    private static boolean checkName(String name) {
        String newName = name.trim();
        return (newName.split(" ").length == 3);
    }

    private static String formatName(String name) {
        String[] names = name.trim().split(" ");
        sortByLength(names);
        String result = "";
        for (int i = 0; i < names.length; i++) {
            char firstLetter = names[i].charAt(0);
            if (Character.isUpperCase(firstLetter)) {
                result += names[i] + " ";
            } else {
                result += Character.toUpperCase(firstLetter) + names[i].substring(1) + " ";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {
        String result = "";
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 1; j < words.length; j++) {
                if (words[j].length() < words[i].length()) {
                    String tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }
    }

    private static boolean checkNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }

    private static String formatNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1,4) + " " + clean.substring(4,7) + " " + clean.substring(7,9) + " " + clean.substring(9);
        return result;
    }
}
