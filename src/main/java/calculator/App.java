package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int[] saveResult = new int[10];
        Queue<Integer> saveResult = new LinkedList<>();

        int count = 1;

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
            System.out.println("결과 : " + result);


            /*
            1.saveResult에 result값을 넣는다 (20,40,60)
            2.가장 먼저 저장된 연산결과를 삭제하시겠습니까?라는 sout을 넣는다.
            3.sc코드를 넣는다 -> remove를 치면 20이 삭제가 되게한다
            *

            8. “**inquiry”라는 문자열이 입력되면 저장된 연산 결과 전부를 출력합니다.**
                - foreach(향상된 for문)을 활용하여 구현 해봅니다.
            * */



            saveResult.add(result);
            System.out.println("remove(삭제)/inquiry(출력)/계속 진행할려면 아무거나 입력");
            String moveString = sc.next();
            if(moveString.equalsIgnoreCase("remove")){
                saveResult.remove();
            } else if (moveString.equalsIgnoreCase("inquiry")) {
                System.out.println("저장된 연산 결과 ");
                for(int res : saveResult){
                    System.out.println(res);
                }
            }

            System.out.println(saveResult.size());











            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String endCal = sc.next();
            if(endCal.equalsIgnoreCase("exit")){
                System.out.println("종료하겠습니다");
                break;
            }
        }
    }
}
