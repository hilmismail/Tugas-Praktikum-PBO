import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float t = scan.nextFloat();
        float luas = a*t/2;

        System.out.printf("%.2f", luas);

        scan.close();
    }
}