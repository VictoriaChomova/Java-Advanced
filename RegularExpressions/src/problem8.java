import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();

                  Pattern verify = Pattern.compile("\\b[a-z0-9]+@[a-z\\d+.-]+\\.[a-z]", Pattern.CASE_INSENSITIVE);
                  Matcher matcher = verify.matcher(email);
                  if (matcher.find()){
                      System.out.println("Email is valid");
                  }
                  else{
                      System.out.println("Email is not valid");
                  }
    }
}
