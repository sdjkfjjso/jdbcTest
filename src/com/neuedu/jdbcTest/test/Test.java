package com.neuedu.jdbcTest.test;

import com.neuedu.jdbcTest.pojo.StudentManager;
import com.neuedu.jdbcTest.pojo.TeacherManager;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请选择教师窗口或学生窗口");
        System.out.println("1 学生窗口");
        System.out.println("2 教师窗口");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                new StudentManager().login();
                break;
            case 2:
                new TeacherManager().login();
                break;
        }
    }
}
