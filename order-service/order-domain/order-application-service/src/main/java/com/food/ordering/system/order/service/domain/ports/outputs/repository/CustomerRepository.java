package com.food.ordering.system.order.service.domain.ports.outputs.repository;

import com.food.ordering.system.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    Optional<Customer> findCustumer(UUID custumerId);
}