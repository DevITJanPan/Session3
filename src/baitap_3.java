import java.util.Scanner;

public class baitap_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a :");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số b :");
        int b = Integer.parseInt(scanner.nextLine());
        if (a == 0 && b == 0) {
            System.out.println("Hai số 0 không có ước chung lớn nhất");
        } else if (a == 0) {
            System.out.println("Ước chung lớn nhất của 2 số là " + Math.abs(b));
        } else if (b == 0) {
            System.out.println("Ước chung lớn nhất của 2 số là " + Math.abs(a));
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;//a=a-b;
                } else {
                    b -= a;// b=b-a;
                }
            }
            System.out.println("Ước chung lớn nhất của 2 số là: " + a);
        }
    }
}
