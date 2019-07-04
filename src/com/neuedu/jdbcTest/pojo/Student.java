package com.neuedu.jdbcTest.pojo;

public class Student {
    private Integer sid;
    private String sno;
    private String sname;
    private String spsw;
    private String ssex;
    private Integer sage;
    private String sbirthday;
    private Integer sheight;
    private Integer sweight;
    private Integer sfalg;

    public Student() {
    }

    public Student(Integer sid, String sno, String sname, String spsw, String ssex, Integer sage, String sbirthday, Integer sheight, Integer sweight, Integer sfalg) {
        this.sid = sid;
        this.sno = sno;
        this.sname = sname;
        this.spsw = spsw;
        this.ssex = ssex;
        this.sage = sage;
        this.sbirthday = sbirthday;
        this.sheight = sheight;
        this.sweight = sweight;
        this.sfalg = sfalg;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpsw() {
        return spsw;
    }

    public void setSpsw(String spsw) {
        this.spsw = spsw;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Integer getSheight() {
        return sheight;
    }

    public void setSheight(Integer sheight) {
        this.sheight = sheight;
    }

    public Integer getSweight() {
        return sweight;
    }

    public void setSweight(Integer sweight) {
        this.sweight = sweight;
    }

    public Integer getSfalg() {
        return sfalg;
    }

    public void setSfalg(Integer sfalg) {
        this.sfalg = sfalg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", spsw='" + spsw + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                ", sbirthday='" + sbirthday + '\'' +
                ", sheight=" + sheight +
                ", sweight=" + sweight +
                ", sfalg=" + sfalg +
                '}';
    }
}
