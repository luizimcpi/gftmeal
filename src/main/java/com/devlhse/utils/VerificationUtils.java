package com.devlhse.utils;

import java.util.List;

public class VerificationUtils {

	public static boolean isNullOrEmptyString(String value) {
		if (value == null || value.isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isNullOrEmptyList(List<?> list) {
		if (list == null || list.isEmpty()) {
			return true;
		}
		return false;
	}
	
}
