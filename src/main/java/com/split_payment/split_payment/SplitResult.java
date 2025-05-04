package com.split_payment.split_payment;

public class SplitResult {
    public double total;
    public int people;
    public double perPerson;

    public SplitResult(double total, int people, double perPerson) {
        this.total = total;
        this.people = people;
        this.perPerson = perPerson;
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

    public double getPerPerson() {
        return perPerson;
    }

    public void setPerPerson(double perPerson) {
        this.perPerson = perPerson;
    }
}
