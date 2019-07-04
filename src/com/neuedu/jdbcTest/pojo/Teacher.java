package com.neuedu.jdbcTest.pojo;

public class Teacher {
    private Integer sid;
    private String tname;
    private String tpassword;
    private Integer sfalg;

    public Teacher() {
    }

    public Teacher(Integer sid, String tname, String tpassword, Integer sfalg) {
        this.sid = sid;
        this.tname = tname;
        this.tpassword = tpassword;
        this.sfalg = sfalg;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public Integer getSfalg() {
        return sfalg;
    }

    public void setSfalg(Integer sfalg) {
        this.sfalg = sfalg;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "sid=" + sid +
                ", tname='" + tname + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", sfalg=" + sfalg +
                '}';
    }
}
