
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.spring_filter.persistence.entity.UnitMeasurement;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitMeasurementRepository extends JpaRepository<UnitMeasurement, Long> {
}
