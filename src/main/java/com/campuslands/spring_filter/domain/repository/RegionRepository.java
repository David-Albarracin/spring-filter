
package com.campuslands.spring_filter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.spring_filter.persistence.entity.Region;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, String> {
}
