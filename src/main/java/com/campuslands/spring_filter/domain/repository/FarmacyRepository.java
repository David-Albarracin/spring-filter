
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.spring_filter.persistence.entity.Farmacy;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacyRepository extends JpaRepository<Farmacy, Long> {
    // Define repository methods here
}
