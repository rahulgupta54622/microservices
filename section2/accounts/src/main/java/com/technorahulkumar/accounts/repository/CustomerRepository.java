package com.technorahulkumar.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technorahulkumar.accounts.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
