package com.ClientRestApi.RestTemplate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class AppService {




    private final RestTemplate  restTemplate;

    @Autowired
    public AppService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public String Consume_Api(){
        return restTemplate.getForObject(
                "https://dummyjson.com/products/1", String.class);
    }
}
