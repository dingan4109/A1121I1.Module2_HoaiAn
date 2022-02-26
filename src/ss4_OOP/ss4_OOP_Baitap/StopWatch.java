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

    public void start(Date now) {
        this.startTime = now;
    }

    public long getElapsedTime(Date start, Date end) {
             long elapsedTime = end.getTime() - start.getTime();
        return elapsedTime;
    }
}
