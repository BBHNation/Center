package com.binhan.center.infrastructure.weeksummary;

import com.binhan.center.infrastructure.Id;
import com.binhan.center.weeksummary.WeekSummary;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "WEEK_SUMMARIES")
@Getter
@Setter
@NoArgsConstructor
public class WeekSummaryEntity extends Id {

    private String planId;

    private String content;

    private int score;

    private String result;

    public WeekSummaryEntity(WeekSummary weekSummary) {
        setId(weekSummary.getId());
        planId = weekSummary.getPlanId();
        content = weekSummary.getContent();
        score = weekSummary.getScore();
        result = weekSummary.getResult().toString();
    }

    public WeekSummary mapToDomain() {
        return new WeekSummary(
                getId(),
                getPlanId(),
                getContent(),
                getScore(),
                WeekSummary.Result.valueOf(getResult()));
    }
}
