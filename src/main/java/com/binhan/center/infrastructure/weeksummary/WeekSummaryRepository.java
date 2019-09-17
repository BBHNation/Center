package com.binhan.center.infrastructure.weeksummary;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeekSummaryRepository extends JpaRepository<WeekSummaryEntity, String> {
    Optional<WeekSummaryEntity> findByPlanId(String planId);
}
