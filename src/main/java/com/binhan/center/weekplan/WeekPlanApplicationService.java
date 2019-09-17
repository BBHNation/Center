package com.binhan.center.weekplan;

import com.binhan.center.infrastructure.weekplan.WeekPlanEntity;
import com.binhan.center.infrastructure.weekplan.WeekPlanRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class WeekPlanApplicationService {

    private final WeekPlanRepository weekPlanRepository;

    public WeekPlanApplicationService(WeekPlanRepository weekPlanRepository) {
        this.weekPlanRepository = weekPlanRepository;
    }

    List<WeekPlan> allWeekPlans() {
        return weekPlanRepository
                .findAll(new Sort(Direction.ASC, "weekNum"))
                .stream()
                .map(WeekPlanEntity::mapToDomain)
                .collect(Collectors.toList());
    }

    void createWeekPlan(WeekPlan weekPlan) {
        weekPlanRepository.save(new WeekPlanEntity(weekPlan));
    }
}
