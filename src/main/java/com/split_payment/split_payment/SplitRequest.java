package com.split_payment.split_payment;

public class SplitRequest {
    private double total;
    private int people;


    public SplitRequest() {}

    public SplitRequest(double total, int people) {
        this.total = total;
        this.people = people;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
}
