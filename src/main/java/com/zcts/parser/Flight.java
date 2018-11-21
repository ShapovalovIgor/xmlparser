package com.zcts.parser;

import javax.xml.datatype.XMLGregorianCalendar;

public class Flight {

    private String code;
    private String airport;
    private Integer number;
    private XMLGregorianCalendar depart;
    private XMLGregorianCalendar arrive;
    private String duration;
    private Boolean isCombine;
    private Boolean isCharter;
    private Float price;

    Flight(String code, String airport, Integer number, XMLGregorianCalendar depart, XMLGregorianCalendar arrive, String duration, Boolean isCombine, Boolean isCharter, Float price) {
        this.code = code;
        this.airport = airport;
        this.number = number;
        this.depart = depart;
        this.arrive = arrive;
        this.duration = duration;
        this.isCombine = isCombine;
        this.isCharter = isCharter;
        this.price = price;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public XMLGregorianCalendar getDepart() {
        return depart;
    }

    public void setDepart(XMLGregorianCalendar depart) {
        this.depart = depart;
    }

    public XMLGregorianCalendar getArrive() {
        return arrive;
    }

    public void setArrive(XMLGregorianCalendar arrive) {
        this.arrive = arrive;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getCombine() {
        return isCombine;
    }

    public void setCombine(Boolean combine) {
        isCombine = combine;
    }

    public Boolean getCharter() {
        return isCharter;
    }

    public void setCharter(Boolean charter) {
        isCharter = charter;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}