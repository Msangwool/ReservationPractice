package com.space.haramspring.core.entity.rothemnew;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FileType {
    NOTICE("notice", "공지사항"),
    ROOM("room", "스터티룸"),
    DEVICE("device", "장비"),
    ;

    private final String key;
    private final String title;
}
