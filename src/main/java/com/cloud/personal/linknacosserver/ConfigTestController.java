package com.cloud.personal.linknacosserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConfigTestController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private String userAge;

    @RequestMapping("/config/test")
    public void testConfig(){
        log.info("user.name = {},user.age = {}",userName,userAge);
    }
}
