package com.neuedu.jdbcTest.test;

import com.neuedu.jdbcTest.uitl.*;

import java.util.Scanner;

public class Show {
    private Scanner input = new Scanner(System.in);

    public void showment() {
        while (true) {
            System.out.println("*******欢迎登陆本学生管理系统*******");
            System.out.println("请选择功能:");
            System.out.println("1  查询学生信息");
            System.out.println("2  查询一个学生信息");
            System.out.println("3  修改学生信息");
            System.out.println("4  添加学生信息");
            System.out.println("5  删除学生信息");
            System.out.println("6  退出系统");

            int i = input.nextInt();
            switch (i) {
                case 1:
                    new Selects().select();
                    break;
                case 2:
                    new SelectOne().select();
                    break;
                case 3:
                    new Updates().update();
                    break;
                case 4:
                    new Inserts().insert();
                    break;
                case 5:
                    new Deletes().delete();
                    break;
                case 6:
                    System.out.println("******系统已退出******");
                    break;
            }


        }
    }
}
