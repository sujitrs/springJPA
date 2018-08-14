package com.sj.spring.jpa.springJPA.model;

import java.util.HashMap;
import java.util.Map;

public enum UserStatusEnum {
    LOCKED(2),
    CREDS_EXPIRED(1),
    ENABLED(0);

    private int value;
    private static Map map = new HashMap<>();

    private UserStatusEnum(int value) {
        this.value = value;
    }

    static {
        for (UserStatusEnum userStatus : UserStatusEnum.values()) {
            map.put(userStatus.value, userStatus);
        }
    }

    public static UserStatusEnum valueOf(int userStatus) {
        return (UserStatusEnum) map.get(userStatus);
    }

    public int getValue() {
        return value;
    }
}