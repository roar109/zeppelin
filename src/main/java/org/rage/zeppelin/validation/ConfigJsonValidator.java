package org.rage.zeppelin.validation;

public class ConfigJsonValidator {

	public static void validateInputJson(String jsonPath) {
		if (jsonPath == null || jsonPath.length() == 0) {
			throw new IllegalArgumentException("Default json is empty or not valid");
		}
	}
}
