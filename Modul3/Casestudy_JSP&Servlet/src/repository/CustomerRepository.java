package repository;

import bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
    void saveCustomer(Customer customer);
    List<Customer> findAllCustomer() throws SQLException;
    Customer findCustomerByCustomerId();
    void deleteCustomerByCustomerName();
}
