import java.util.Base64;
import java.util.Scanner;

public class decoder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base64 encoded string: ");
        String input = s.nextLine();
        String decoded;
        decoded = new String(Base64.getDecoder().decode(input));
        System.out.println(decoded);
    }
}
