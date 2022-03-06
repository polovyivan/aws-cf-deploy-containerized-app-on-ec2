package com.polovyi.ivan.repository;

import com.polovyi.ivan.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

}
