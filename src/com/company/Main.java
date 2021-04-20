package com.company;

import java.util.Scanner;

class Student{
    char major, id, name, grade;
    int score;


    Student(char major, char id, char name, int score) {
        this.major = major;
        this.id = id;
        this.name = name;
        this.score = score;
        this.grade = grade;

    }
}

public class Main{
    static int grade_A=0, grade_B=0, grade_C=0, grade_D=0, grade_F=0, score_sum=0;
    static double average = 0;
    private boolean retake = false;

    public static void main(String[] args){
        final int MAX = 5;

        Student student[] = new Student[MAX];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<student.length; i++){
            System.out.println("전공, 학번, 이름, 점수를 입력하세요. : ");
            student[i] = new Student(sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0), sc.nextInt());
            gradeCount(student[i]);
            System.out.println(student[2]);
        }
        average = score_sum/5;
        printTap();
    }


    static void gradeCount(Student student){

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

    static void printTap(){
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
        System.out.println("총합 5명 (평균 "+average+"점)");
    }
}

