package com.dkm.h2crudysnacks;

import com.dkm.h2crudysnacks.model.Customer;
import com.dkm.h2crudysnacks.model.Snack;
import com.dkm.h2crudysnacks.model.VendingMachine;
import com.dkm.h2crudysnacks.repository.CustomerRepository;
import com.dkm.h2crudysnacks.repository.SnackRepository;
import com.dkm.h2crudysnacks.repository.VendingMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class SnackBarController
{
    @Autowired
    CustomerRepository custrepos;

    @Autowired
    SnackRepository snackrepos;

    @Autowired
    VendingMachineRepository vendingrepos;


    @GetMapping("/customer")
    public List<Customer> allcust()
    {
        return custrepos.findAll();
    }

    @GetMapping("/customer/{name}")
    public Customer findCustomer(@PathVariable String name)
    {
        return custrepos.findByName(name);
    }

    @GetMapping("/snack")
    public List<Snack> allsnacks()
    {
        return snackrepos.findAll();
    }

    @GetMapping("/snack/vending")
    public List<Object[]> vendingSnacks()
    {
        return snackrepos.vendingSnacks();
    }

    @GetMapping("/vending")
    public List<VendingMachine> allvending()
    {
        return vendingrepos.findAll();
    }

    @GetMapping("/vending/{name}")
    public List<VendingMachine> namedvending(@PathVariable String name)
    {
        return vendingrepos.findByName(name);
    }


    @DeleteMapping("/vending/{id}")
    public void deleteVendingMachine(@PathVariable Long id)
    {
        vendingrepos.deleteById(id);
    }


    @DeleteMapping("/snack/{id}")
    public void deleteSnack(@PathVariable Long id)
    {
        snackrepos.deleteById(id);
    }
}