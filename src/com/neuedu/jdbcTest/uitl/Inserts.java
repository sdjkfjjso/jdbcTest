package com.neuedu.jdbcTest.uitl;

import com.neuedu.jdbcTest.test.Conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Inserts {
    private Scanner input = new Scanner(System.in);

    public void insert(){

        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        System.out.println("请输入要添加的学生学号");
        String no = input.next();
        System.out.println("请输入要添加的学生姓名");
        String name = input.next();
        System.out.println("请输入要添加的学生密码");
        String pass = input.next();
        System.out.println("请输入要添加的学生性别");
        String sex = input.next();
        System.out.println("请输入要添加的学生年龄");
        int age = input.nextInt();
        System.out.println("请输入要添加的学生出生年月");
        String birthday = input.next();
        System.out.println("请输入要添加的学生身高");
        int height = input.nextInt();
        System.out.println("请输入要添加的学生体重");
        int weight = input.nextInt();

        String sql = "insert into student(sno,sname,spsw,ssex,sage,sbirthday,sheight,sweight,sfalg) values ('"+no+"','"+name +"','"+pass+"','"+sex+"',"+age+",'"+birthday+"',"+height+","+weight+",1)";
        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            int is = state.executeUpdate(sql);
            System.out.println(is);
            System.out.println("添加成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(ResultSet rs, Statement state, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (state != null){
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
