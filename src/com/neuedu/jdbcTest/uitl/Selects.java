package com.neuedu.jdbcTest.uitl;

import com.neuedu.jdbcTest.pojo.Student;

import com.neuedu.jdbcTest.test.Conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Selects {
    public void select(){
        List<Student> list = new ArrayList<>();
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        String sql = "select * from student";

        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            rs = state.executeQuery(sql);

            while (rs.next()){
             int sid = rs.getInt("sid");
             String sno = rs.getString("sno");
             String sname = rs.getString("sname");
             String spsw = rs.getString("spsw");
             String ssex = rs.getString("ssex");
             int sage = rs.getInt("sage");
             String sbirthday = rs.getString("sbirthday");
             int sheight = rs.getInt("sheight");
             int sweight = rs.getInt("sweight");
             int sfalg = rs.getInt("sfalg");
             Student stu = new Student(sid,sno,sname,spsw,ssex,sage,sbirthday,sheight,sweight,sfalg);
             list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            for (Student s:list) {
                System.out.println(s);
            }
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
