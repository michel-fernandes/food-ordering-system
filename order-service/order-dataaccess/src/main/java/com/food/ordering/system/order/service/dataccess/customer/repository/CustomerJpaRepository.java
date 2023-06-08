package com.food.ordering.system.order.service.dataccess.customer.repository;

import com.food.ordering.system.order.service.dataccess.customer.entity.CustomerEntity;
import com.food.ordering.system.order.service.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, UUID> {
    public Optional<Customer> findCustumer(UUID customerId);
    public Customer save(Customer customer);
}
