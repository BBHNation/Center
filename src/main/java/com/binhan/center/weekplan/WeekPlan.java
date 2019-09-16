package com.binhan.center.weekplan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeekPlan {
    private String id;

    private int weekNum;

    private String content;

    private String award;

    private String punishment;

    public WeekPlan(int weekNum, String content, String award, String punishment) {
        this.weekNum = weekNum;
        this.content = content;
        this.award = award;
        this.punishment = punishment;
    }
}
