package com.binhan.center.weekplan.view;

import com.binhan.center.weekplan.WeekPlan;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateWeekPlanRequest {
    private int weekNum;

    @NotBlank private String content;

    @NotBlank private String award;

    @NotBlank private String punishment;

    public WeekPlan mapToDomain() {
        return new WeekPlan(weekNum, content, award, punishment);
    }
}
