package JavaCore.Module_4_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args) {

        String text = "2000 2001 1885 2020";
        Pattern pattern = Pattern.compile("20\\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }

    }

}
