package com.space.haramspring.core.entity.rothemnew;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Day {
    MONDAY("monday", "월요일"),
    TUESDAY("tuesday", "화요일"),
    WENDESDAY("wednesday", "수요일"),
    THURSDAY("thursday", "목요일"),
    FRIDAY("friday", "금요일"),
    ;

    private final String key;
    private final String title;
}
