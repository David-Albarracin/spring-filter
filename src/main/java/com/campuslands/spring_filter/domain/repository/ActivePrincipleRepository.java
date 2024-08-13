
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campuslands.spring_filter.persistence.entity.ActivePrinciple;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivePrincipleRepository extends JpaRepository<ActivePrinciple, Long> {
    // Define repository methods here
}
