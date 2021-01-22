package JavaCore.Module_4_5;

public class LoaderSwitch {
    public static void main(String[] args) {
        char letter1 = 'h';
        char letter2 = 'i';
        char letter3 = 'b';
        System.out.println(decode(letter1) + " " + decode(letter2) + " " + decode(letter3));

    }

    public static String decode(char letter) {
        switch (letter) {
            case 'i':
                return "I can decode!";
            case 'h':
                return "Hello!";
            case 'b':
                return "Bye!";
            default:
                return "I don’t know these symbols :(";
        }
    }
}
