package com.dkm.h2crudysnacks.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="vendingmachine")
public class VendingMachine
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "vendingMachine")
    private Set<Snack> snacks;

    public VendingMachine()
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

    public Set<Snack> getSnacks()
    {
        return snacks;
    }

    public void setSnacks(Set<Snack> snacks)
    {
        this.snacks = snacks;
    }
}