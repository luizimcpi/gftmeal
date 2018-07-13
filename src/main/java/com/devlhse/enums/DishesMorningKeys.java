package com.devlhse.enums;

public enum DishesMorningKeys {
	
	EGGS("1","eggs"),
	TOAST("2","toast"),
	COFFEE("3","coffee"),
	ERROR("4","error");

    private final String key;
    private final String value;

    DishesMorningKeys(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }


    public static String getNamefromMorningDishByKey(String code) {
        for (DishesMorningKeys dishesEnum : DishesMorningKeys.values()) {
            if(dishesEnum.key.equals(code.trim())){
                return dishesEnum.getValue();
            }
        }
        return "";
    }

}
