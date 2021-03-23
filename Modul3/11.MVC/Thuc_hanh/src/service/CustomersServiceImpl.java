package service;

import model.Customer;
import repository.CustomersRepository;
import repository.CustomersRepositoryImpl;

import java.util.List;

public class CustomersServiceImpl implements CustomersService {
    private CustomersRepository repository= new CustomersRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        repository.update(id,customer);
    }

    @Override
    public void remove(int id) {

    }
}
