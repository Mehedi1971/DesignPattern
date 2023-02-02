package com.mahedi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PatientService {
	@Autowired
	private RestTemplate template = new RestTemplate();
	private String url="http://localhost:8087/api/patient";
	public Object[] findAlle() {
		return template.getForObject(url, Object[].class);
	}

}
