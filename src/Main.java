import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Len = scanner.nextInt();
        System.out.println(Password.PassGeneration(Len));
    }
}
