package com.devlhse.enums;

import java.util.Arrays;

public enum DishesNightKeys {

	STEAK("1", "steak"),
	POTATO("2", "potato"),
	WINE("3", "wine"),
	CAKE("4", "cake");

    private final String key;
    private final String value;

    DishesNightKeys(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

    public static DishesNightKeys getNamefromNightDish(String code) {
        return Arrays.stream(values())
                .filter(mv -> mv.key.equals(code))
                .findFirst()
                .orElse(null);
    }
    
}
