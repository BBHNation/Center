package com.binhan.center.weekplan;

import com.binhan.center.weekplan.view.CreateWeekPlanRequest;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/create")
    public ResponseEntity createWeekPlan(@RequestBody @Valid CreateWeekPlanRequest request) {
        weekPlanApplicationService.createWeekPlan(request.mapToDomain());
        return ResponseEntity.ok().build();
    }
}
