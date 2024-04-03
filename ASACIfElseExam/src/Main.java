import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select;

        System.out.println("밥을 많이 먹었더니 졸리다. 잠을 깨야 할 것 같은데..");
        System.out.printf("1. 커피를 마신다\t");
        System.out.printf("2. 에너지 드링크를 마신다.\t");
        System.out.printf("3. 창문을 열어 바깥 공기를 쐰다.\t");
        System.out.println("4. 지압슬리퍼를 신는다.");

        Scanner scan = new Scanner(System.in);
        select = scan.nextInt();
        System.out.printf("%d번을 선택하셨습니다! \n", select);

        if (select == 1) {
            while (true) {
                System.out.printf("1. 점심엔 아아가 국룰이다.\t");
                System.out.printf("2. 봄엔 뜨아지.\t");
                System.out.println("3. 다시 고를래.");
                select = scan.nextInt();
                if (select == 3) {
                    break;
                } else {
                    System.out.printf("%d번 커피 선택을 완료했습니다! \n", select);
                    break;
                }
            }
        } else if (select == 2) {
            while (true) {
                System.out.printf("1. 몬스터\t");
                System.out.printf("2. 핫식스\t");
                System.out.println("3. 다시 고를래");
                select = scan.nextInt();
                if (select == 1 || select == 2) {
                    System.out.printf("1. 캔 채로 마신다.");
                    System.out.println("2. 얼음을 타서 마신다.");
                }else if(select == 3){
                    break;
                }else {
                    System.out.printf("%d번 에너지 드링크 선택을 완료했습니다! \n", select);
                    break;
                }
            }
        } else if (select == 3) {while (true) {
            System.out.printf("1. 바람 들어오게 활짝 열어야겠다.\t");
            System.out.printf("2. 선거유세 시끄러우니까 반만 열어야겠다.\t");
            System.out.println("3. 다시 고를래");
            select = scan.nextInt();
            if (select == 1) {
                System.out.printf("1. 방충망도 연다\t");
                System.out.printf("2. 방충망은 닫는다\t");
                select=scan.nextInt();
            } else if(select == 3){
                break;
            } else {
                System.out.printf("%d번 선택을 완료했습니다! \n", select);
                break;
            }
        }

        } else if (select == 4) {while (true) {
            System.out.printf("1. 맨발은 아프니까 양말을 신어야겠다.\t");
            System.out.printf("2. 이왕 신은김에 산책이나 다녀올까?\t");
            System.out.println("3. 다시 고를래");
            select = scan.nextInt();
            if (select == 3) {
                break;
            } else {
                System.out.printf("%d번 선택을 완료했습니다.\n",select);
                break;
            }
        }
        } else {
            System.out.println("잘못된 선택입니다. 프로그램을 다시 시작해주세요.");
        }
    }
}
