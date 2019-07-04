package com.neuedu.jdbcTest.pojo;

import com.neuedu.jdbcTest.test.Conn;
import com.neuedu.jdbcTest.test.Show;

import java.sql.*;
import java.util.Scanner;

public class TeacherManager {

    private Scanner input = new Scanner(System.in);

    public void login(){

        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        System.out.println("请输入用户名:");
        String name = input.next();
        System.out.println("请输入密码:");
        String password = input.next();

            String sql = "select tpassword from teacher where tname='"+name+"'";

        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if (rs.next()){

                if (password.equals(rs.getString("tpassword"))){
                    System.out.println("欢迎教师,登陆成功");
                    new Show().showment();
                }else {
                    System.out.println("用户名或密码错误,请重新输入");
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rs,state,conn);
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
