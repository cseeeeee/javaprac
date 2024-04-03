import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("도형의 크기를 입력해주세요.");

        int size = scan.nextInt();

        if (size%2==0){
            size++;
        }
        for (int i = 1; i <= size; i += 2) {
            String star = "";
            for (int j = size - 1; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                star += "*";
            }
            System.out.println(star);
        }


        for (int i = 1; i < size; i += 2) {
            String star = "";
            for (int j = 0; j < i; j+=2) {
//                star += "*";
                System.out.print(" ");
            }
            for (int j = size - 1; j > i; j --) {
//                System.out.print(" ");
                star+="*";
            }
            System.out.println(star);
        }
        scan.close();
    }
}