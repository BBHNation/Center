package com.binhan.center.weekplan.view;

import com.binhan.center.weekplan.WeekPlan;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateWeekPlanRequest {
    private int weekNum;

    private String content;

    private String award;

    private String punishment;

    public WeekPlan mapToDomain() {
        return new WeekPlan(weekNum, content, award, punishment);
    }
}
