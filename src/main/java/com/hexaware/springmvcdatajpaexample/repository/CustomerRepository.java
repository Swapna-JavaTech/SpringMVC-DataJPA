package com.hexaware.springmvcdatajpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springmvcdatajpaexample.entity.Customer;



@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
