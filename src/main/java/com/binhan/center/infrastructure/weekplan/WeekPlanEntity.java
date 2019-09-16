package com.binhan.center.infrastructure.weekplan;

import com.binhan.center.infrastructure.Id;
import com.binhan.center.weekplan.WeekPlan;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "WEEK_PLANS")
@Setter
@Getter
@NoArgsConstructor
public class WeekPlanEntity extends Id {

    private int weekNum;

    private String content;

    private String award;

    private String punishment;

    public WeekPlan mapToDomain() {
        return new WeekPlan(getId(), weekNum, content, award, punishment);
    }

    public WeekPlanEntity(WeekPlan weekPlan) {
        this.weekNum = weekPlan.getWeekNum();
        this.content = weekPlan.getContent();
        this.award = weekPlan.getAward();
        this.punishment = weekPlan.getPunishment();
    }
}
