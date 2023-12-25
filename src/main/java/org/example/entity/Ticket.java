package org.example.entity;


import org.example.annotation.DateFormat;

public class Ticket {
    @DateFormat
    private String startDate;

    @DateFormat(value = "yyyy/MM/dd HH:mm:ss")
    private String endDate;

    public Ticket() {
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
