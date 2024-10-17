import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요( +, -, *, /): ");
            char operator = sc.next().charAt(0); // charAt() String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break; // 반복문 종료
                    }
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                    break;
                default:
                    System.out.println("정확한 기호만 사용해주세요.");
                    break;
            }

            sc.nextLine(); // 버퍼에 남은 개행문자 처리
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String stop = sc.nextLine();
            if (stop.equals("exit")) {
                System.out.println("계산이 종료되었습니다.");
                break;
            }
        }
    }
}