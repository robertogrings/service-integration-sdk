package com.appdirect.sdk.vendorrequiredfields.model;

import java.util.Arrays;
import java.util.stream.Stream;

public enum FlowType {
	END_USER_FLOW("END_USER_FLOW"), RESELLER_FLOW("RESELLER_FLOW");

	private String value;

	private FlowType(String value) {
		this.value = value;
	}

	public static FlowType fromValue(String value) {
		return Stream.of(values())
			.filter(flowType -> flowType.value.equalsIgnoreCase(value))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values())));
	}
}
