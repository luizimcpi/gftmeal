package com.devlhse.enums;

public enum DishesMorningKeys {
	
	EGGS(1,"eggs"),
	TOAST(2,"toast"),
	COFFEE(3,"coffee"),
	ERROR(4,"error");

    private final int key;
    private final String value;

    DishesMorningKeys(int key, String value) {
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
