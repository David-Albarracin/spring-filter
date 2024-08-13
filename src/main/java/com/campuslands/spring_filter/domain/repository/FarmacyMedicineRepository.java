
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.spring_filter.persistence.entity.FarmacyMedicine;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacyMedicineRepository extends JpaRepository<FarmacyMedicine, Long> {
    // Define repository methods here
}
