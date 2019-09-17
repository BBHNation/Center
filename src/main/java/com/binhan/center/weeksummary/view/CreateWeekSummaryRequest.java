package com.binhan.center.weeksummary.view;

import com.binhan.center.weeksummary.WeekSummary;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateWeekSummaryRequest {
    @NotBlank private String planId;

    @NotBlank private String content;

    private int score;

    @NotBlank private String result;

    public WeekSummary mapToDomain() {
        return new WeekSummary(
                getPlanId(), getContent(), getScore(), WeekSummary.Result.valueOf(getResult()));
    }
}
