package com.ClientRestApi.RestTemplate.Controller;

import com.ClientRestApi.RestTemplate.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {
    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }
    @GetMapping("/Api")
    public String  Get_Api(){
        return appService.Consume_Api();
    }
}
