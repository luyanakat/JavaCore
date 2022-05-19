import java.util.Scanner;
public class FakeTest {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();
        int countT = 0;
        int countH = 0;
        int countS = 0;
        for (int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                countH++;
            }
            if (Character.isLowerCase(text.charAt(i))) {
                countT++;
            }
            if (Character.isDigit(text.charAt(i))) {
                countS++;
            }
        }
        System.out.println("Trong chuỗi " + text +
                " có " + countH + " ký tự in hoa," +
                " có " + countT + " ký tự in thường" +
                " và có " + countS + " số.");
    }
}
