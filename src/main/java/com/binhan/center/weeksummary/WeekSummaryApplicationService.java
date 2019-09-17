package com.binhan.center.weeksummary;

import com.binhan.center.infrastructure.exception.NotFoundException;
import com.binhan.center.infrastructure.weeksummary.WeekSummaryEntity;
import com.binhan.center.infrastructure.weeksummary.WeekSummaryRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class WeekSummaryApplicationService {

    private final WeekSummaryRepository weekSummaryRepository;

    public WeekSummaryApplicationService(WeekSummaryRepository weekSummaryRepository) {
        this.weekSummaryRepository = weekSummaryRepository;
    }

    String createWeekSummary(WeekSummary weekSummary) {
        return weekSummaryRepository.save(new WeekSummaryEntity(weekSummary)).getId();
    }

    List<WeekSummary> allWeekSummaries() {
        return weekSummaryRepository
                .findAll()
                .stream()
                .map(WeekSummaryEntity::mapToDomain)
                .collect(Collectors.toList());
    }

    WeekSummary findWeekSummaryById(String weekSummaryId) {
        return weekSummaryRepository
                .findById(weekSummaryId)
                .orElseThrow(NotFoundException.weekSummaryNotFoundException())
                .mapToDomain();
    }

    WeekSummary findWeekSummaryByPlanId(String weekplanId) {
        return weekSummaryRepository
                .findByPlanId(weekplanId)
                .orElseThrow(NotFoundException.weekSummaryNotFoundException())
                .mapToDomain();
    }
}
