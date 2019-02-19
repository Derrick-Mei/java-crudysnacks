package com.dkm.h2crudysnacks.repository;

import com.dkm.h2crudysnacks.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    public Customer findByName(String name);
}