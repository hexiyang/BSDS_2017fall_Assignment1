package bsdsass2testdata;

import java.io.Serializable;

public class DummyClass implements Serializable{
    private int resortID;
    private int dayNum;
    private int skierID;
    private int liftID;
    private int time;

    public DummyClass() {}
    public DummyClass(int resortID, int dayNum, int skierID, int liftID, int time) {
        this.resortID = resortID;
        this.dayNum = dayNum;
        this.skierID = skierID;
        this.liftID = liftID;
        this.time = time;
    }

    public int getResortID() {
        return resortID;
    }

    public void setResortID(int resortID) {
        this.resortID = resortID;
    }

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public int getSkierID() {
        return skierID;
    }

    public void setSkierID(int skierID) {
        this.skierID = skierID;
    }

    public int getLiftID() {
        return liftID;
    }

    public void setLiftID(int liftID) {
        this.liftID = liftID;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int compareTo(DummyClass compareData) {
        int compareTime = ((DummyClass) compareData).getTime();

        //ascending order
        return this.time - compareTime ;
    }
}
