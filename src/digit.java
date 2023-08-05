import java.util.Scanner;

public class digit {
    public static boolean isAllDigits(String str) {
        if (str.isEmpty())
        {
            return true;
        }
        char firstChar = str.charAt(0);
        if (!Character.isDigit(firstChar)) {
            return false;
        }
        return isAllDigits(str.substring(1));
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s: ");
        String input = scanner.nextLine();

        if (isAllDigits(input))
        {
            System.out.println("yes");
        } else
        {
            System.out.println("no");
        }
        scanner.close();
    }
}