package com.company;



/**
 * Created by Admin on 24.01.2016.
 */
public class Date {
    protected int yy;
    protected  int mm;
    protected int dd;

    public Date() {
    }

    public Date( int yy,int mm, int dd) {
        this.yy = yy;
        this.mm = mm;
        this.dd = dd;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year:" + yy +
                ", month:" + mm +
                ", date:" + dd +
                '}';
    }
}
