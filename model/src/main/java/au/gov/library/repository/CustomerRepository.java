package au.gov.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.gov.library.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
