package com.mahedi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatService {

//    @Autowired
//    private
private RestTemplate template = new RestTemplate();
    public Object[] findAlle() {
        return template.getForObject("https://jsonplaceholder.typicode.com/users/", Object[].class);
    }
}
