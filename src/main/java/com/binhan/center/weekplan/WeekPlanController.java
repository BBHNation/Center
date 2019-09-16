package com.binhan.center.weekplan;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weekplan")
public class WeekPlanController {
    private final WeekPlanApplicationService weekPlanApplicationService;

    public WeekPlanController(WeekPlanApplicationService weekPlanApplicationService) {
        this.weekPlanApplicationService = weekPlanApplicationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<WeekPlan>> allWeekPlans() {
        return ResponseEntity.ok(weekPlanApplicationService.allWeekPlans());
    }
}
