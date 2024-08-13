
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.spring_filter.persistence.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
