import java.util.Scanner;

public class baitap_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số tiền gửi :");
        double money =Double.parseDouble(scanner.nextLine());
        System.out.println("Tháng gửi tiền :");
        int month=Integer.parseInt(scanner.nextLine());
        System.out.println("Tỉ lệ lãi suất :");
        double interestRate=Double.parseDouble(scanner.nextLine());
        double totalInterest=0;
        for (int i = 0; i <month ; i++) {
            totalInterest+=money*(interestRate/100)/12*month;
        }
        System.out.println("Total of interest:"+totalInterest);
    }
}
