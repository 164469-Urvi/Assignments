package com.urvi.loadbalancing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.inject.Inject;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RibbonClient(name="load-balancing-service",configuration=LoadBalancingApplication.class)
public class LoadBalancingApplication {

	@Inject
	private RestTemplate restTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(LoadBalancingApplication.class, args);
	}
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}

