package data;

import model.CustomerType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama_resort?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "05122002";
    private static final String SELECT_CUSTOMER_TYPE = "SELECT * FROM customer_type";
    private static final String GET_CUSTOMER_TYPE_BY_ID = "SELECT * FROM customer_type where customer_type_id = ?;";

    public  CustomerTypeDAO() {
    }
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    public CustomerType selectTypeNote(int id) {
        CustomerType customerType = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_CUSTOMER_TYPE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("customer_type_name");
                customerType = new CustomerType(id, name);
            }
            connection.close();
        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return customerType;
    }
    public List<CustomerType> selectAllCustomerType() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<CustomerType> customerTypes = new ArrayList<>();
        // Step 1: Establishing a Connection
        // Step 2:Create a statement using connection object
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_TYPE)) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("customer_type_id");
                String name = rs.getString("customer_type_name");
                customerTypes.add(new CustomerType(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypes;
    }
}
