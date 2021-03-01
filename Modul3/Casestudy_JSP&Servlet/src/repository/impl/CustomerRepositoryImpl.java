package repository.impl;

import bean.Customer;
import repository.CustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private BaseRepository baseRepository= new BaseRepository();
    private final String SQL_FIND_ALL_CUSTOMER="select* from customer";
    private final String SQL_UPDATE_CUSTOMER="update customer"+"set customer_name=?, customer_birthday=? " +
            "customer_gender=?, customer_id_card=?, customer_phone=?, customer_email=?, customer_address=?" +
            "customer_type_id=? where customer_id=?";


    @Override
    public void saveCustomer(Customer customer) {
        if(customer.getCustomer_id() == Integer.parseInt(null)){
        }else {
            try {
                PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_UPDATE_CUSTOMER);
                preparedStatement.setString(1, customer.getCustomer_name());

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Customer> findAllCustomer() throws SQLException {
        List<Customer> customerList=new ArrayList<>();
        PreparedStatement preparedStatement=this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL_CUSTOMER);
        ResultSet resultSet=preparedStatement.executeQuery();
        Customer customer=null;
        while (resultSet.next()){
            customer= new Customer();
            customer.setCustomer_id(resultSet.getInt("customer_id"));
            customer.setCustomer_name(resultSet.getString("customer_name"));
            customer.setCustomer_birthday(resultSet.getString("birthday"));
            customer.setCustomer_gender(resultSet.getString("gender"));
            customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
            customer.setCustomer_phone(resultSet.getString("customer_phone"));
            customer.setCustomer_email(resultSet.getString("customer_email"));
            customer.setCustomer_address(resultSet.getString("customer_address"));
            customer.setCustomer_type_id(resultSet.getInt("customer_type_id"));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer findCustomerByCustomerId() {
        return null;
    }

    @Override
    public void deleteCustomerByCustomerName() {

    }
}
