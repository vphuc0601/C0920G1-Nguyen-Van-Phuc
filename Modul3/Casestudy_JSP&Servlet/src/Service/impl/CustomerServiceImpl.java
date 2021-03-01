package service.impl;

import bean.Customer;
import repository.CustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository= new CustomerRepositoryImpl();
    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.saveCustomer(customer);
    }

    @Override
    public List<Customer> findAllCustomer() throws SQLException {
        return customerRepository.findAllCustomer();
    }

    @Override
    public Customer findCustomerByCustomerId() {
        return null;
    }

    @Override
    public void deleteCustomerByCustomerName() {

    }
}
