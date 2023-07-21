import java.util.Scanner;

public class baitap_4 {
    public static void main(String[] args) {
        /*
         * In ra menu sau:
         * **********Menu**********
         * 1. Phở bò kobe
         * 2. Bánh mỳ trứng
         * 3. Mỳ tôm không người lái
         * 4. Thoát
         * Sự lựa chọn của bạn :
         **/
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("**********Menu**********");
            System.out.println("1. Phở bò kobe");
            System.out.println("2. Bánh mỳ trứng");
            System.out.println("3. Mỳ tôm không người lái");
            System.out.println("4. Thoát");
            System.out.println("Sự lựa chọn của bạn :");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn Phở bò kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn Bánh mỳ trứng");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn Mỳ tôm không người lái");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn giá trị từ 1-4");
            }
        }while(true);
    }
}
