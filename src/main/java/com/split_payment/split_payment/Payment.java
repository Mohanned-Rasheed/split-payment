package com.split_payment.split_payment;

import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double total;
    private int people;

    public Payment() {}

    public Payment(double total, int people) {
        this.total = total;
        this.people = people;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public int getPeople() { return people; }
    public void setPeople(int people) { this.people = people; }
}
