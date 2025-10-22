package ie.atu.week4;
import java.util.Scanner;
public class TryBefore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age: ");
        String text = sc.nextLine().trim();
        age = Integer.parseInt(text);

        System.out.println("Thanks! You entered age = " + age);
    }
}
