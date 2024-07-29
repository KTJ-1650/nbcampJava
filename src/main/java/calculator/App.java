package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("num1, num2 ="+ num1 + "," + num2);

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator =sc.next().charAt(0);

            System.out.println("operator = " + operator);
            int result = 0;
            switch (operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0){
                        result= num1 / num2;
                    }else {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 연산 기호 입니다.");

                    break;
            }
                System.out.println("결과 : "+ result);


                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String endCal = sc.next();
                if(endCal.equalsIgnoreCase("exit")){
                    System.out.println("종료하겠습니다");
                    break;
                }

        }
    }
}
