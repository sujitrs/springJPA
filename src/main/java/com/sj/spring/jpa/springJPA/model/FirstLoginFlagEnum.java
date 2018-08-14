package com.sj.spring.jpa.springJPA.model;

import java.util.HashMap;
import java.util.Map;

public enum FirstLoginFlagEnum {
    YES('Y'),
    NO('N');

    private char value;
    private static Map map = new HashMap<>();

    private FirstLoginFlagEnum(char value) {
        this.value = value;
    }

    static {
        for (FirstLoginFlagEnum firstLoginFlagEnum : FirstLoginFlagEnum.values()) {
            map.put(firstLoginFlagEnum.value, firstLoginFlagEnum);
        }
    }

    public static FirstLoginFlagEnum valueOf(char firstLoginFlagEnum) {
        return (FirstLoginFlagEnum) map.get(firstLoginFlagEnum);
    }

    public int getValue() {
        return value;
    }
}