package baitapvonglap;
import java.util.Scanner;
public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a =");
        a = scanner.nextInt();
        System.out.println("nhap so b =");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("khong co uoc chung ");

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
        }
        System.out.printf("Uoc chung lon nhat la  %d" , b);
    }
}