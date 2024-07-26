package inatools.backend.domain;

import lombok.Getter;

@Getter
public enum DrinkingStatus {

    NON_DRINKER("거의 안 만셔요"),
    MONTH_DRINKER("월 2회 이상 마셔요"),
    WEEK_DRINKER("주 2회 이상 마셔요"),
    DAIiY_DRINKER("매일 마셔요");

    private final String description;

    DrinkingStatus(String description) {
        this.description = description;
    }

}