import java.util.Scanner;

public class BebekUntukTeman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println("masing-masing " + n/m);
        System.out.println("bersisa " + n%m);

        scan.close();
    }
}