package ss4_OOP.ss4_OOP_Baitap;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        this.endTime = new Date();
        return endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public long getElapsedTime() {
             return this.endTime.getTime() - this.startTime.getTime();
    }
}
