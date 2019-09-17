package com.binhan.center.weeksummary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeekSummary {
    private String id;
    private String planId;
    private String content;
    private int score;
    private Result result;

    @Getter
    public enum Result {
        GET_AWARD("GET_AWARD"),
        GET_PUNISHMENT("GET_PUNISHMENT"),
        NOTHING_TODO("NOTHING_TODO");

        private String name;

        Result(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public WeekSummary(String planId, String content, int score, Result result) {
        this.planId = planId;
        this.content = content;
        this.score = score;
        this.result = result;
    }
}
