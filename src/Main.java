import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
		System.out.println("Input password length:");
        Scanner scanner = new Scanner(System.in);
        int Len = scanner.nextInt();
        System.out.println(PassGen.getPassword(Len));
    }
}
