
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.spring_filter.persistence.entity.Laboratory;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {
    // Define repository methods here
}
