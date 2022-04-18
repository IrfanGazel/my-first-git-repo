import java.util.Scanner;

public class EleventhJavaClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        int result = (int) Math.pow(number, 2);
        System.out.println(result);
    }
}
