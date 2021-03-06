package com.appdirect.sdk.vendorrequiredfields;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.appdirect.sdk.vendorrequiredfields.model.FlowType;
import com.appdirect.sdk.vendorrequiredfields.model.OperationType;

@Configuration
public class VendorRequiredFieldConfiguration {

	@Bean
	public VendorRequiredFieldController vendorRequiredFieldController(VendorRequiredFieldHandler vendorRequiredFieldHandler) {
		return new VendorRequiredFieldController(vendorRequiredFieldHandler);
	}

	@Bean
	public VendorRequiredFieldHandler vendorRequiredFieldHandler() {
		return (String sku, FlowType flowType, OperationType operationType) -> {
			throw new UnsupportedOperationException(String.format("Vendor required field Service for sku=%s, flow type=%s and operation type=%s is not supported.", sku, flowType, operationType));
		};
	}
}
