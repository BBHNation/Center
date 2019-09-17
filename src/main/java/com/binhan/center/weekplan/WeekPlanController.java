package com.binhan.center.weekplan;

import com.binhan.center.weekplan.view.CreateWeekPlanRequest;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping("/create")
    public ResponseEntity<String> createWeekPlan(
            @RequestBody @Valid CreateWeekPlanRequest request) {
        return ResponseEntity.ok(weekPlanApplicationService.createWeekPlan(request.mapToDomain()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<WeekPlan>> allWeekPlans() {
        return ResponseEntity.ok(weekPlanApplicationService.allWeekPlans());
    }

    @GetMapping("/{weekplanId}")
    public ResponseEntity<WeekPlan> weekPlan(@PathVariable String weekplanId) {
        return ResponseEntity.ok(weekPlanApplicationService.findWeekPlanById(weekplanId));
    }
}
