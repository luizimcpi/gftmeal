package com.devlhse.enums;

public enum DishesNightKeys {

	STEAK(1, "steak"),
	POTATO(2, "potato"),
	WINE(3, "wine"),
	CAKE(4, "cake");

    private final int key;
    private final String value;

    DishesNightKeys(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    
}
