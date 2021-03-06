package com.ibm.cloud.academy.service.impl;

import com.ibm.cloud.academy.service.ServiceC;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class ServiceCImpl implements ServiceC {

	@Value("${serviceUrl}")
	String serviceUrl;

	private final RestTemplate rest;

	public ServiceCImpl(RestTemplate rest) {
		this.rest = rest;
	}

	@HystrixCommand( fallbackMethod = "defaultCall" )
	public String callD() {
		return Objects.requireNonNull(rest.getForEntity(serviceUrl, String.class).getBody());
	}

	public String defaultCall() {
		return "Luglio 2022 (fallback-service-c)";
	}
}