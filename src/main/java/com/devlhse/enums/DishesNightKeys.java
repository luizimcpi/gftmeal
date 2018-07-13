package com.devlhse.enums;

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

    public static String getNamefromNightDishByKey(String code) {
        for (DishesNightKeys dishesEnum : DishesNightKeys.values()) {
            if(dishesEnum.key.equals(code.trim())){
                return dishesEnum.getValue();
            }
        }
        return "";
    }
    
}
