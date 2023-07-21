import java.util.Scanner;

public class baitap_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number=Integer.parseInt(scanner.nextLine());
        boolean checkPriem=true;
        if(number>=2){
            for (int i = 2; i <=Math.sqrt(number); i++) {
                if(number%i==0){
                    checkPriem=false;
                    break;
                }
                i++;
            }
        }else{
            checkPriem=true;
        }
        if(checkPriem){
            System.out.printf("%d là số nguyên tố\n",number);
        }else{
            System.out.printf("%d không phải là số nguyên tố\n",number);
        }
    }
}
