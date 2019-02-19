package com.dkm.h2crudysnacks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="snack")
public class Snack
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private int quantity;

    private double cost;

    @ManyToOne
    @JoinColumn(name ="vendingid", nullable=false)
    @JsonIgnore
    private VendingMachine vendingMachine;

    public Snack()
    {
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public VendingMachine getVendingMachine()
    {
        return vendingMachine;
    }

    public void setVendingMachine(VendingMachine vendingMachine)
    {
        this.vendingMachine = vendingMachine;
    }
}