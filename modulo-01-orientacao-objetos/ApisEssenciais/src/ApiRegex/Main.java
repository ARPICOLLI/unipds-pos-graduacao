package ApiRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email = "java_developer@mail.com";
        System.out.println(email.matches("^[\\w._-]+@[\\w]+\\.[a-zA-Z0-9]{2,6}"));
        String texto = "O cep da residência é 13523-214";
        Pattern pattern = Pattern.compile("\\d{5}-\\d{3}");
        Matcher matcher = pattern.matcher(texto);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
