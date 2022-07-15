package com.ibm.cloud.academy.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
class GatewayServiceFallback implements FallbackProvider {

	private static final String DEFAULT_MESSAGE = "IBM Cloud Academy Luglio 2022 (fallback-gateway)";

	@Override
	public String getRoute() {
		return "*"; // Fallback for all Routes
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		return new GatewayClientResponse(HttpStatus.SERVICE_UNAVAILABLE, DEFAULT_MESSAGE);
	}
}
