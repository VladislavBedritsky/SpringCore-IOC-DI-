package com.spring.core;

import java.text.DateFormat;
import java.time.LocalDate;

public class Event {

    private Integer id;
    private String msg;
    private LocalDate localDate;
    private DateFormat dateFormat;

    public Event(LocalDate localDate, DateFormat dateFormat) {
        this.localDate = localDate;
        this.dateFormat = dateFormat;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", localDate=" + dateFormat.format(localDate) +
                '}';
    }
}
