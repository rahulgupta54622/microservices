package com.technorahulkumar.accounts.service;

import com.technorahulkumar.accounts.dto.CustomerDto;

public interface IAccountsService {
    
    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
