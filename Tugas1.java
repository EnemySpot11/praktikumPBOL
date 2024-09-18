import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to registration station");

        System.out.print("What is your name: ");
        String nama = scanner.nextLine();

        System.out.print("Type your nim: ");
        String nim = scanner.nextLine();

        System.out.println("Hello: " + nama);
        System.out.println("And your nim is: " + nim);

        scanner.close();
    }
}
