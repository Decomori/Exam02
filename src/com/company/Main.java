package com.company;

import java.util.Scanner;

class Student{ //학생정보 클래스 선언
    char major, id, name, grade; //변수 선언
    int score;


    Student(char major, char id, char name, int score) { //클래스 내의 정보를 담는 메소드 생성
        this.major = major;
        this.id = id;
        this.name = name;
        this.score = score;
        this.grade = grade;

    }
}

public class Main{
    static int grade_A=0, grade_B=0, grade_C=0, grade_D=0, grade_F=0, score_sum=0; //각 학점을 카운팅 할 변수 선언
    static double average = 0; //학생들 점수 평균을 낼 변수
    private boolean retake = false;

    public static void main(String[] args){
        final int MAX = 5; //배열에 사용할 변수 선언

        Student student[] = new Student[MAX]; //배열 생성

        Scanner sc = new Scanner(System.in); //값을 입력받을 스캐너 생성
        for(int i=0; i<student.length; i++){ //각 학생의 정보를 반복으로 입력받는 반복문
            System.out.println("전공, 학번, 이름, 점수를 입력하세요. : ");
            student[i] = new Student(sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0), sc.nextInt());
            gradeCount(student[i]); //각각 맞는 정보를 입력 받는다.
        }
        average = score_sum/5; //평균 계산
        printTap(); //출력을 하는 메소드 호출
    }


    static void gradeCount(Student student){ //학점을 계산해주고 위에서 선언한 학점 카운팅에 더해주는 방식의 메소드.

        score_sum += student.score;
        if(student.score>=90) {
            grade_A++;
        }
        else if(80 <= student.score && 90 > student.score) {
            grade_B++;
        }
        else if(70 <= student.score && 80 > student.score) {
            grade_C++;
        }
        else if(60 <= student.score && 70 > student.score) {
            grade_D++;
        }
        else{
            grade_F++;
        }
    }

    static void printTap(){ //학점대로 출력 및 별 출력.
        //System.out.println("* 재수강 대상자는");
        System.out.print("A("+grade_A+"명) |");
        for(int i=0; i<grade_A; i++){
            System.out.print("*");
        } System.out.println("");

        System.out.print("B("+grade_B+"명) |");
        for(int i=0; i<grade_B; i++){
            System.out.print("*");
        } System.out.println("");

        System.out.print("C("+grade_C+"명) |");
        for(int i=0; i<grade_C; i++){
            System.out.print("*");
        } System.out.println("");

        System.out.print("D("+grade_D+"명) |");
        for(int i=0; i<grade_D; i++){
            System.out.print("*");
        } System.out.println("");

        System.out.print("F("+grade_F+"명) |");
        for(int i=0; i<grade_F; i++){
            System.out.print("*");
        } System.out.println("");
        System.out.println("----------------------------");
        System.out.println("총합 5명 (평균 "+average+"점)"); //평균 계산
    }
}

