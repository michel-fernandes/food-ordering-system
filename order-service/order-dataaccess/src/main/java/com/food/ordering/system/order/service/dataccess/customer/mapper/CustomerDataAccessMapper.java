package com.food.ordering.system.order.service.dataccess.customer.mapper;

import com.food.ordering.system.domain.valueobject.CustomerId;
import com.food.ordering.system.order.service.dataccess.customer.entity.CustomerEntity;
import com.food.ordering.system.order.service.domain.entity.Customer;

public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()), customerEntity.getUsername(),
                customerEntity.getFirstName(),
                customerEntity.getLastName());
    }

    public CustomerEntity customerToCustomerEntity(Customer customer) {
        return CustomerEntity.builder()
                .id(customer.getCustomerId().getValue())
                .username(customer.getUsername())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .build();    }
}
