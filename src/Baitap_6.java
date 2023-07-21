import java.util.Scanner;

public class Baitap_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên tố cần in :");
        int number=Integer.parseInt(scanner.nextLine());
        int cnt=0;
        int n=2;
        System.out.printf("%d số nguyên tố đầu tiên là :\n",number);
        while(number!=cnt){
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf("%d\t",n);
                cnt++;
            }
            n++;
        }
    }
}
