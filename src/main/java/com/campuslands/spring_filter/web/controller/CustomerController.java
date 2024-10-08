
package com.campuslands.spring_filter.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.spring_filter.domain.service.CustomerService;
import com.campuslands.spring_filter.persistence.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> listCustomer(){
        return this.customerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> view(@PathVariable String id){
        Optional<Customer> optionalCustomer  = customerService.findById(id);
        if (optionalCustomer.isPresent()){
            return ResponseEntity.ok(optionalCustomer.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Customer customer, BindingResult result){
        if (result.hasFieldErrors()) {
            return validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.save(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable String id, @RequestBody Customer customer){
        Optional<Customer> customerOptional = this.customerService.update(id, customer);
        if (customerOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(customerOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable String id){
        //Customer customer = new Customer();
        //customer.setId(id);
        Optional<Customer> optionalCustomer = this.customerService.delete(id);
        if (optionalCustomer.isPresent()){
            return ResponseEntity.ok(optionalCustomer.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }

}
