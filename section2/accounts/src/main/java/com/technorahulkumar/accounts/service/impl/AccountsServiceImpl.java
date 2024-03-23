package com.technorahulkumar.accounts.service.impl;

import java.util.Random;

import com.technorahulkumar.accounts.constants.AccountsConstants;
import com.technorahulkumar.accounts.dto.CustomerDto;
import com.technorahulkumar.accounts.entity.Accounts;
import com.technorahulkumar.accounts.entity.Customer;
import com.technorahulkumar.accounts.mapper.CustomerMapper;
import com.technorahulkumar.accounts.repository.AccountsRepository;
import com.technorahulkumar.accounts.repository.CustomerRepository;
import com.technorahulkumar.accounts.service.IAccountsService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
       Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
       Customer savedCustomer = customerRepository.save(customer);
       accountsRepository.save(createNewAccount(savedCustomer));
    }

    /**
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
    
}
