package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inMoney=0, price, won_100, won_500, won_1000;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("투입할 금액을 입력하세요."); //투입한 금액이 정수인지 확인
            inMoney = sc.nextInt();
        }
        catch (InputMismatchException ime) {
            //정수가 아닌 다른 것이 입력됐을 때 뜨는 오류 예외설정
            new Scanner(System.in);
            System.out.println("돈이 아닙니다. 돈을 넣어주세요.");
            System.exit(0); //중단점 설정
        }

        try { //입력한 금액이 정수인지 확인
            if (inMoney % 100 != 0) {
                System.out.println("100원 단위로 다시 입력하세요.");
                System.exit(0); //중단점 설정
            } else {
                System.out.print("제품 금액을 입력하세요.");
                price = sc.nextInt();

                if (inMoney < price) { //금액 확인 문
                    System.out.println("돈이 부족합니다.");
                } else if (price % 100 != 0) {
                    System.out.println("제품 금액을 100원 단위로 입력해주세요.");
                } else if (inMoney <= 0) {
                    System.out.println("돈이 입력되지 않았습니다.");
                } else {
                    inMoney -= price;
                }
                System.out.println("잔액 : " + inMoney);
            }
        }
        catch (InputMismatchException ime) {
            //정수가 아닌 다른 것이 입력됐을 때 뜨는 오류 예외설정
            new Scanner(System.in);
            System.out.println("잘못된 금액입니다.");
            System.exit(0); //중단점 설정
        }
            won_1000 = inMoney / 1000;
            inMoney %= 1000;
            won_500 = inMoney / 500;
            inMoney %= 500;
            won_100 = inMoney / 100;

            System.out.println("천원 : " + won_1000 + "\n오백원 : " + won_500 + "\n백원 : " + won_100);
        }
}