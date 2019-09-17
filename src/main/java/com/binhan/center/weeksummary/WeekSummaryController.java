package com.binhan.center.weeksummary;

import com.binhan.center.weeksummary.view.CreateWeekSummaryRequest;
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
@RequestMapping("/weeksummary")
public class WeekSummaryController {
    private final WeekSummaryApplicationService weekSummaryApplicationService;

    public WeekSummaryController(WeekSummaryApplicationService weekSummaryApplicationService) {
        this.weekSummaryApplicationService = weekSummaryApplicationService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createWeekSummary(
            @RequestBody @Valid CreateWeekSummaryRequest createWeekSummaryRequest) {
        return ResponseEntity.ok(
                weekSummaryApplicationService.createWeekSummary(
                        createWeekSummaryRequest.mapToDomain()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<WeekSummary>> weekSummary() {
        return ResponseEntity.ok(weekSummaryApplicationService.allWeekSummaries());
    }

    @GetMapping("/{weekSummaryId}")
    public ResponseEntity<WeekSummary> weekSummary(@PathVariable String weekSummaryId) {
        return ResponseEntity.ok(weekSummaryApplicationService.findWeekSummaryById(weekSummaryId));
    }

    @GetMapping("/plan/{weekplanId}")
    public ResponseEntity<WeekSummary> weekSummaryOfPlan(@PathVariable String weekplanId) {
        return ResponseEntity.ok(weekSummaryApplicationService.findWeekSummaryByPlanId(weekplanId));
    }
}
